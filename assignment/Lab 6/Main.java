package Lab6.problem1;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                AppFrame frame = new AppFrame();
                frame.setVisible(true);
            }
        });
    }
}
