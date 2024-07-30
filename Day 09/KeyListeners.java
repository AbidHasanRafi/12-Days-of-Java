import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListeners {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyFrame());
    }
}

class MyFrame extends JFrame implements KeyListener {

    private JLabel label;
    private ImageIcon icon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setFocusable(true); // Ensure JFrame can receive key events
        this.requestFocusInWindow(); // Request focus for the JFrame

        // Load and resize the image
        icon = new ImageIcon(new ImageIcon("ship.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));

        // Set up the label with the image
        label = new JLabel();
        label.setBounds(200, 200, 100, 100); // Initial position and size of the label
        label.setIcon(icon);

        // Set the background color of the content pane
        this.getContentPane().setBackground(Color.black);
        this.add(label);

        // Add key listener to the JFrame
        this.addKeyListener(this);

        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Handle keyTyped events if needed
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Handle keyPressed events
        int step = 10;
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:  // Arrow Left
                if (label.getX() - step >= 0) { // Ensure it does not move out of bounds
                    label.setLocation(label.getX() - step, label.getY());
                }
                break;
            case KeyEvent.VK_UP:    // Arrow Up
                if (label.getY() - step >= 0) { // Ensure it does not move out of bounds
                    label.setLocation(label.getX(), label.getY() - step);
                }
                break;
            case KeyEvent.VK_RIGHT: // Arrow Right
                if (label.getX() + label.getWidth() + step <= this.getWidth()) { // Ensure it does not move out of bounds
                    label.setLocation(label.getX() + step, label.getY());
                }
                break;
            case KeyEvent.VK_DOWN:  // Arrow Down
                if (label.getY() + label.getHeight() + step <= this.getHeight()) { // Ensure it does not move out of bounds
                    label.setLocation(label.getX(), label.getY() + step);
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Handle keyReleased events
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
