import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TwoDAnimation {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyFrame());
    }
}

class MyFrame extends JFrame {
    MyFrame() {
        MyPanel panel = new MyPanel();
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Timer timer;
    int xVelocity = 5;
    int yVelocity = 5;
    int x = 0;
    int y = 0;

    MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);

        enemy = new ImageIcon("enemy.png").getImage();
        if (enemy == null) {
            System.err.println("Image not found!");
        }
        timer = new Timer(16, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (enemy != null) {
            Graphics2D g2D = (Graphics2D) g;
            g2D.drawImage(enemy, x, y, this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0) {
            xVelocity *= -1;
        }
        x += xVelocity;

        if (y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0) {
            yVelocity *= -1;
        }
        y += yVelocity;

        repaint();
    }
}
