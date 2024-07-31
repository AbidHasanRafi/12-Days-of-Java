import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyBindings {
    public static void main(String[] args) {
        // Key Bindings - bind an Action to a KeyStroke
        // Don't require you to click a component to give it focus
        // All Swing components use Key Bindings
        // Increased flexibility compared to KeyListeners
        // Can assign key strokes to individual Swing components
        // More difficult to utilize and set up

        SwingUtilities.invokeLater(() -> new Game());
    }
}

class Game {

    private JFrame frame;
    private JLabel label;
    private Action upAction;
    private Action downAction;
    private Action leftAction;
    private Action rightAction;

    Game() {
        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.RED);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);

        // Create actions
        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        // Bind key strokes to actions
        InputMap inputMap = label.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = label.getActionMap();

        inputMap.put(KeyStroke.getKeyStroke('W'), "upAction");
        actionMap.put("upAction", upAction);
        inputMap.put(KeyStroke.getKeyStroke('S'), "downAction");
        actionMap.put("downAction", downAction);
        inputMap.put(KeyStroke.getKeyStroke('A'), "leftAction");
        actionMap.put("leftAction", leftAction);
        inputMap.put(KeyStroke.getKeyStroke('D'), "rightAction");
        actionMap.put("rightAction", rightAction);

        frame.add(label);
        frame.setVisible(true);
    }

    private class UpAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    private class DownAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    private class LeftAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    private class RightAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }
}
