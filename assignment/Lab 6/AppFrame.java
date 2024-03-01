package Lab6.problem1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class AppFrame extends JFrame  {

    JPanel loginPanel;

    JPanel cards;
    JTextField usernameField;
    JTextField  infoTextField;
    JPasswordField passwordField;

    String username;
    String password;

    ListItem login = new ListItem("Login", true);
    ListItem viewTitles = new ListItem("View Titles", false);
    ListItem addBook = new ListItem("Add Book", false);


    public static void centerFrameOnDesktop(Component f) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth = f.getSize().width;
        int xpos = (width - frameWidth) / 2;
        int ypos = (height - frameHeight) / 3;
        f.setLocation(xpos, ypos);
    }

    AppFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello World");
        setSize(700, 300);
        setMinimumSize(new Dimension(500, 240));
        centerFrameOnDesktop(this);
        setResizable(true);

        createMainPanel();

        ListItem[] items = {
                login, viewTitles, addBook
        };
        JList<ListItem> itemsList = new JList(items);

        itemsList.addListSelectionListener(event -> {
            String value = itemsList.getSelectedValue().getItemName();
            boolean allowed = itemsList.getSelectedValue().isHighlight();
            System.out.println(value + " " + allowed);

            CardLayout cl = (CardLayout) (cards.getLayout());

            if (!allowed) {
                value = login.getItemName();
                itemsList.setSelectedIndex(0);
            }
            cl.show(cards, value);
        });

        itemsList.setCellRenderer(new DefaultListCellRenderer() {
            @SuppressWarnings("rawtypes")
            @Override
            public Component getListCellRendererComponent(JList list,
                                                          Object value, int index,
                                                          boolean isSelected, boolean cellHasFocus) {
                Component c = super.getListCellRendererComponent(list,
                        value, index, isSelected, cellHasFocus);
                if (value instanceof ListItem) {
                    ListItem nextItem = (ListItem) value;
                    setText(nextItem.getItemName());
                    if (nextItem.isHighlight()) {
                        setForeground(Util.LINK_AVAILABLE);
                    } else {
                        setForeground(Util.LINK_NOT_AVAILABLE);
                    }
                    if (isSelected) {
                        setForeground(Color.BLACK);
                        setBackground(new Color(236,243,245));
                    }
                } else {
                    setText("illegal item");
                }
                return c;
            }
        });

        itemsList.setMinimumSize(new Dimension(150, 0));
        JSplitPane splitPane = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,
                itemsList,
                cards
        );

        splitPane.setDividerLocation(0.4);

        infoTextField = new JTextField();
        infoTextField.setText("Not logged in");

        JSplitPane splitPane2 = new JSplitPane(
                JSplitPane.VERTICAL_SPLIT,
                splitPane,
                infoTextField
        );
        splitPane2.setDividerLocation(0.9);
        add(splitPane2);
    }

    void createMainPanel() {
        cards = new JPanel(new CardLayout());

        JPanel loginPanel = createLoginPanel();
        JPanel itemListPanel = createItemListPanel();
        JPanel addItemPanel = createAddPanel();

        cards.add(loginPanel, login.getItemName());
        cards.add(itemListPanel, viewTitles.getItemName());
        cards.add(addItemPanel, addBook.getItemName());
    }

    JPanel createItemListPanel() {
        JEditorPane textArea = new JEditorPane();
        String displayText = String.join("\n", Data.bookTitles);
        textArea.setText(displayText);
        textArea.setSize(new Dimension(350, 200));
        JPanel container = new JPanel();
        container.setLayout(new BorderLayout());
        JLabel loginTitle = new JLabel();
        loginTitle.setText("View Titles");
        loginTitle.setForeground(Util.DARK_BLUE);
        container.add(loginTitle, BorderLayout.NORTH);

        container.add(textArea, BorderLayout.CENTER);
        return container;
    }

    JPanel createLoginPanel() {
        loginPanel = new JPanel();
        loginPanel.setLayout(new BorderLayout());

        usernameField = new JTextField();
        usernameField.setPreferredSize(new Dimension(150, 30));
        usernameField.setName("Username");

        JLabel usernameLabel = new JLabel();
        usernameLabel.setText("Username");

        JPanel usernameContainer = new JPanel();
        usernameContainer.setLayout(new BorderLayout());
        usernameContainer.add(usernameField, BorderLayout.NORTH);
        usernameContainer.add(usernameLabel, BorderLayout.SOUTH);

        passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(150, 30));
        passwordField.setName("Password");

        JLabel passwordLabel = new JLabel();
        passwordLabel.setText("Password");

        JPanel passwordContainer = new JPanel();
        passwordContainer.setLayout(new BorderLayout());
        passwordContainer.add(passwordField, BorderLayout.NORTH);
        passwordContainer.add(passwordLabel, BorderLayout.SOUTH);

        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new BorderLayout());


        containerPanel.add(passwordContainer, BorderLayout.EAST);
        containerPanel.add(usernameContainer, BorderLayout.WEST);

        JPanel spacingContainerPanel = new JPanel();
        spacingContainerPanel.setLayout(new BorderLayout());
        spacingContainerPanel.add(containerPanel, BorderLayout.WEST);
        spacingContainerPanel.add(new JPanel(), BorderLayout.EAST);

        JPanel container = new JPanel();
        container.setLayout(new BorderLayout());
        JLabel loginTitle = new JLabel();
        loginTitle.setText("Login");
        loginTitle.setForeground(Util.DARK_BLUE);
        container.add(loginTitle, BorderLayout.NORTH);
        container.add(spacingContainerPanel, BorderLayout.SOUTH);

        JButton loginButton = new JButton();
        loginButton.setText("Login");
        loginButton.addActionListener(evt -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username == null || password.isEmpty() || username.isEmpty()) {
                infoTextField.setText("Username or password must not be empty");
                infoTextField.setForeground(Color.RED);
                return;
            }

            User user = Util.findUser(Data.logins, new User(username, password, null));
            if (user == null) {
                infoTextField.setText("Username / password is invalid!");
                infoTextField.setForeground(Color.RED);
                return;
            }

            infoTextField.setText("Logged in as " + user.username);
            infoTextField.setForeground(Color.GREEN);

            System.out.println("User logged in: " + user.username + ", Auth: " + user.authorization);
            if (user.authorization == Auth.MEMBER) {
                viewTitles.setHighlight(true);
                addBook.setHighlight(false);
            } else if (user.authorization == Auth.SELLER) {
                viewTitles.setHighlight(false);
                addBook.setHighlight(true);
            } else if (user.authorization == Auth.BOTH) {
                viewTitles.setHighlight(true);
                addBook.setHighlight(true);
            }
            repaint();
        });
        loginButton.setPreferredSize(new Dimension(100, 30));

        JPanel space = new JPanel();

        JPanel buttonContainer = new JPanel();
        buttonContainer.setLayout(new BorderLayout());
        buttonContainer.add(space, BorderLayout.WEST);
        buttonContainer.add(loginButton, BorderLayout.EAST);

        JPanel layoutContainer = new JPanel();
        layoutContainer.setLayout(new BorderLayout());
        layoutContainer.add(container, BorderLayout.NORTH);
        layoutContainer.add(buttonContainer, BorderLayout.SOUTH);

        return layoutContainer;
    }

    JPanel createAddPanel() {

        JPanel centerLayoutContainer = new JPanel();

        JPanel authorFirstNameContainer = new JPanel();
        authorFirstNameContainer.setLayout(new BoxLayout(authorFirstNameContainer, BoxLayout.X_AXIS));
        JLabel authorFirstName = new JLabel();
        authorFirstName.setText("Author First Name");
        JTextField authorFirstNameField = new JTextField();
        authorFirstNameField.setSize(new Dimension(200, 35));

        authorFirstNameContainer.add(authorFirstName);
        authorFirstNameContainer.add(authorFirstNameField);

        JPanel authorLastNameContainer = new JPanel();
        authorLastNameContainer.setLayout(new BoxLayout(authorLastNameContainer, BoxLayout.X_AXIS));
        JLabel authorLastName = new JLabel();
        authorLastName.setText("Author Last Name");
        JTextField authorLastNameField = new JTextField();
        authorLastNameField.setSize(new Dimension(200, 35));

        authorLastNameContainer.add(authorLastName);
        authorLastNameContainer.add(authorLastNameField);


        JPanel bookTitleContainer = new JPanel();
        bookTitleContainer.setLayout(new BoxLayout(bookTitleContainer, BoxLayout.X_AXIS));
        JLabel bookTitle = new JLabel();
        bookTitle.setText("Book Title");
        JTextField bookTitleField = new JTextField();
        bookTitleField.setSize(new Dimension(200, 35));

        bookTitleContainer.add(bookTitle);
        bookTitleContainer.add(bookTitleField);

        JPanel textAreaContainer = new JPanel();
        textAreaContainer.setLayout(new BoxLayout(textAreaContainer, BoxLayout.Y_AXIS));
        textAreaContainer.add(authorFirstNameContainer);
        textAreaContainer.add(authorLastNameContainer);
        textAreaContainer.add(bookTitleContainer);

        JButton button = new JButton();
        button.setText("Add Book");
        button.addActionListener(e -> {
            String authorFirstNameText = authorFirstNameField.getText();
            String authorLastNameText = authorLastName.getText();
            String bookTitleText = bookTitleField.getText();

            if (authorFirstNameText == null ||
                    authorLastNameText == null ||
                    bookTitleText == null ||
                    authorFirstNameText.isEmpty() ||
                    authorLastNameText.isEmpty() ||
                    bookTitleText.isEmpty()) {
                infoTextField.setText("Author first name, last name and book title must be provided");
                infoTextField.setForeground(Color.GREEN);
                return;
            }

            Data.addBookTitle(bookTitleText);
            repaint();
        });

        textAreaContainer.add(button);
        JPanel container = new JPanel();
        container.setLayout(new BorderLayout());
        JLabel loginTitle = new JLabel();
        loginTitle.setText("Add Book Title");
        loginTitle.setForeground(Util.DARK_BLUE);
        container.add(loginTitle, BorderLayout.NORTH);
        container.add(textAreaContainer, BorderLayout.CENTER);
        container.add(new JPanel(), BorderLayout.SOUTH);
        return container;
    }
}
