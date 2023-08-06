import javax.swing.*;

public class FirstFrame extends JFrame {
    
    private JLabel label;

    public FirstFrame() {
        
       super("Hello World");

       label = new JLabel("Hello World", SwingConstants.CENTER);
       getContentPane().add(label);
       setSize(600, 400);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
    }
}