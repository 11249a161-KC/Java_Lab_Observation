import java.applet.Applet;
import java.awt.Button;

public class FlowLayout extends Applet {
    public void init() {
        setLayout(new java.awt.FlowLayout());

        add(new Button("Button 1"));
        add(new Button("Button 2"));
        add(new Button("Button 3"));
        add(new Button("Button 4"));
        add(new Button("Button 5"));
    }
}
