import javax.swing.*;
import java.awt.*;

public class TwoDGraphics {
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

class MyPanel extends JPanel {

    MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Ensure proper painting

        Graphics2D g2D = (Graphics2D) g;

        // Example drawing code
        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(0, 0, 500, 500);

        // Uncomment and modify the following lines to test other drawing options

        // g2D.setPaint(Color.pink);
        // g2D.drawRect(0, 0, 100, 200);
        // g2D.fillRect(0, 0, 100, 200);

        // g2D.setPaint(Color.orange);
        // g2D.drawOval(0, 0, 100, 100);
        // g2D.fillOval(0, 0, 100, 100);

        // g2D.setPaint(Color.red);
        // g2D.drawArc(0, 0, 100, 100, 0, 180);
        // g2D.fillArc(0, 0, 100, 100, 0, 180);
        // g2D.setPaint(Color.white);
        // g2D.fillArc(0, 0, 100, 100, 180, 180);

        // int[] xPoints = {150, 250, 350};
        // int[] yPoints = {300, 150, 300};
        // g2D.setPaint(Color.yellow);
        // g2D.drawPolygon(xPoints, yPoints, 3);
        // g2D.fillPolygon(xPoints, yPoints, 3);

        // g2D.setPaint(Color.magenta);
        // g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        // g2D.drawString("U R A WINNER! :D", 50, 50);
    }
}
