import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class GUI 
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Stock Portfolio");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Hello, GUI!");
        JButton button = new JButton("Click Me");

        panel.add(label);
        panel.add(button);

        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
