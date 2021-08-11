import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class myPanel extends JPanel implements ActionListener {
    final int SCREEN_WIDTH = 250, SCREEN_HEIGHT = 150;
    Color backgroundColor = new Color(0, 106, 213);
    // Color clickedColor = new Color(23, 234, 52);
    Color labelColor = new Color(248, 182, 255);
    Random rnd = new Random();


    myPanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(backgroundColor);
        this.setFocusable(true);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Graphics g = getGraphics();
                // g.setColor(clickedColor);
                g.setColor(new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
                System.out.println(e.getXOnScreen() * 2 + ", " + e.getYOnScreen() * 2);
                g.fillOval(e.getX(), e.getY(), 15, 15);
                g.setColor(labelColor);
                g.drawString(e.getXOnScreen() * 2 + ", " + e.getYOnScreen() * 2, e.getX(), e.getY());
                g.dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
