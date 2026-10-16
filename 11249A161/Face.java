import java.applet.Applet;
import java.awt.*;

public class Face extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(80, 40, 160, 180);

        g.setColor(Color.BLACK);
        g.fillOval(120, 90, 15, 20);
        g.fillOval(185, 90, 15, 20);

        g.drawLine(160, 110, 145, 145);
        g.drawLine(145, 145, 165, 145);

        g.drawArc(120, 140, 80, 40, 200, 140);
    }
}
