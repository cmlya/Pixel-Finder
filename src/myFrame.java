import javax.swing.*;

public class myFrame extends JFrame {
    public myFrame() {
        this.add(new myPanel());
        this.setTitle("Click On Me!");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        this.setIconImage(new ImageIcon("Icon.png").getImage());
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
