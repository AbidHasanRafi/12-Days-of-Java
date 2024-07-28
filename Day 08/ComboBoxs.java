import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxs {
    public static void main(String[] args) {
        // JComboBox = A component that combines a button or editable field and a
        //             drop-down list

        SwingUtilities.invokeLater(() -> new MyFrame());
    }
}

class MyFrame extends JFrame implements ActionListener {

    private JComboBox<String> comboBox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = { "dog", "cat", "bird" };

        comboBox = new JComboBox<>(animals);
        comboBox.addActionListener(this);

        // comboBox.setEditable(true);
        // System.out.println(comboBox.getItemCount());
        // comboBox.addItem("horse");
        // comboBox.insertItemAt("pig", 0);
        // comboBox.setSelectedIndex(0);
        // comboBox.removeItem("cat");
        // comboBox.removeItemAt(0);
        // comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
