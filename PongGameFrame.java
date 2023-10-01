import javax.swing.*;
import java.awt.*;

public class PongGameFrame extends JFrame {
    PongPanel panel;

    PongGameFrame() {
        panel = new PongPanel();
        this.add(panel);
        this.setTitle("Ping Pong");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
