import java.applet.Applet;
import java.awt.*;

public class ColoredShapes extends Applet{
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(40, 40, 120, 60);

        g.setColor(Color.BLUE);
        g.fillOval(200, 40, 100, 60);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Java Applets are fun!", 40, 150);
    }    
}

