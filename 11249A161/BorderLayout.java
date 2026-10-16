import java.applet.Applet;
import java.awt.Button;

public class BorderLayout extends Applet {
    public void init() {
        setLayout(new java.awt.BorderLayout());

        add(new Button("North"), java.awt.BorderLayout.NORTH);
        add(new Button("South"), java.awt.BorderLayout.SOUTH);
        add(new Button("East"), java.awt.BorderLayout.EAST);
        add(new Button("West"), java.awt.BorderLayout.WEST);
        add(new Button("Center"), java.awt.BorderLayout.CENTER);
    }
}
