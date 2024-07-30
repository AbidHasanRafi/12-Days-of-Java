import java.awt.*;
import javax.swing.*;

public class ProgressBars {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ProgressBarDemo());
    }
}

class ProgressBarDemo {

    JFrame frame;
    JProgressBar bar;

    ProgressBarDemo() {
        frame = new JFrame("Progress Bar Demo");
        bar = new JProgressBar(0, 100);
        
        bar.setValue(0);
        bar.setBounds(10, 10, 400, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);
        
        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 100);
        frame.setLayout(null);
        frame.setVisible(true);
        
        fill();
    }

    public void fill() {
        Timer timer = new Timer(50, e -> {
            int currentValue = bar.getValue();
            if (currentValue >= 100) {
                ((Timer) e.getSource()).stop();
                bar.setString("Done! :)");
            } else {
                bar.setValue(currentValue + 1);
            }
        });
        timer.start();
    }
}