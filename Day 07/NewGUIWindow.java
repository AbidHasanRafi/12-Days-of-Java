import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class NewGUIWindow {
    public static void main(String[] args) {
        LaunchPage launchPage = new LaunchPage();
    }
}

class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("Open New Window");

    LaunchPage() {

        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == myButton) {
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }
    }
}

class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello, World! This is 12-Days-of-Java!");

    NewWindow() {

        label.setBounds(10, 10, 500, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}