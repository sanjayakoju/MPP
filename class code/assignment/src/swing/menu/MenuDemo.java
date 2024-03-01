package swing.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuDemo implements ActionListener{
	
	JFrame f1;
	JMenu m1, m2;
	JMenuBar mb;
	JMenuItem mi1,mi2;
	JLabel label;
	MenuDemo() {
		f1 = new JFrame("Menu");
		f1.setSize(300,300);
		mb = new JMenuBar();
		m1 = new JMenu("File");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mi1 = new JMenuItem("Save");
		mi2 = new JMenuItem("Open");
		f1.setJMenuBar(mb);
		mb.add(m1);
		m1.add(mi1);
		m1.add(mi2);
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		label = new JLabel();
		f1.add(label);
//		f1.setLayout(null);
		f1.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MenuDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == mi1) {
			label.setText("Save");
		}
		
		if (e.getSource() == mi2) {
			label.setText("Open");
		}
		
	}

}
