
import java.applet.Applet;
import java.awt.*;

public class Shapes extends Applet {
    public void paint(Graphics g) {
        g.drawRect(30, 50, 100, 60);
        g.drawOval(170, 50, 70, 70);
        g.drawLine(30, 160, 150, 160);

        g.drawLine(200, 160, 250, 220);
        g.drawLine(250, 220, 150, 220);
        g.drawLine(150, 220, 200, 160);
    }
}
