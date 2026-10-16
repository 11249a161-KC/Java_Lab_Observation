
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class GridLayout extends Applet {
    public void init() {
        setLayout(new java.awt.GridLayout(4, 4));

        add(new TextField(""));

        add(new Button("7"));
        add(new Button("8"));
        add(new Button("9"));
        add(new Button("+"));

        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
        add(new Button("-"));

        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("*"));

        add(new Button("0"));
        add(new Button("C"));
        add(new Button("="));
        add(new Button("/"));
    }
}
