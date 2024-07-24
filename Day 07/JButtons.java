import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtons {
    public static void main(String[] args) {
        // JButton = a button that performs an action when clicked on

        new MyFrame();
    }
}

class MyFrame extends JFrame implements ActionListener{
    JButton button;
    MyFrame(){

        button = new JButton();
        button.setBounds(100, 100, 200, 50);
        button.addActionListener(this);
        button.setText("Button");
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setForeground(Color.darkGray);
        button.setBackground(Color.cyan);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("clicked!");
        }
    }
}