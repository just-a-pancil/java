package NewProgect;

import javax.swing.*;
import java.awt.*;

public class Prog {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new theFrame();
            frame.setTitle("FRAME");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class theFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public theFrame() {
        setLocationByPlatform(true);
        add(new frameComponent());
        pack();
        toBack();
    }
}

/**
 * Компонент, выводящий сообщение
 */

class frameComponent extends JComponent {
    private static final long serialVersionUID = 1L;
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics g) {
        g.drawString("Not a Hello, World program", MESSAGE_X, MESSAGE_Y);
    }

    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}