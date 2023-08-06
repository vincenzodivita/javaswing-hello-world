import javax.swing.*;

public class FirstFrame extends JFrame {
    
    public FirstFrame() {
        
       super("Hello World");
       setSize(600, 400);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
    }
}