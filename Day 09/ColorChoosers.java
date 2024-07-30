import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JLabel;

public class ColorChoosers {
    public static void main(String[] args) {
        // Launch the application
        new MyFrame();
    }
}

class MyFrame extends JFrame implements ActionListener {

    private JButton button;
    private JLabel label;

    MyFrame() {
        // Set up the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // Initialize and configure the button
        button = new JButton("Pick a color");
        button.addActionListener(this);

        // Initialize and configure the label
        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text :D");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setOpaque(true);

        // Add components to the frame
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // Show the color chooser dialog
            Color selectedColor = JColorChooser.showDialog(this, "Pick a color", label.getForeground());

            // Check if the user selected a color
            if (selectedColor != null) {
                label.setForeground(selectedColor);
                // Optionally, set the background color
                // label.setBackground(selectedColor);
            }
        }
    }
}
