import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.net.*;
import main.*;

public class Game extends JApplet {
    public void int() {
        Dimension size = getSize();
        size.width -= 10;
        size.height -= 10;
        Container CP = getContentPane(;
        CP.setLayout(null);
        CP.setBackground(new Color(220, 255, 220));
        AppletContext AC = getAppletContext();
        URL CB = getCodeVase();
        MainPanel pn = new MainPanel(AC, CB, size);
        CP.add(pn);
        pn.setSize(size.width, size.height);
        pn.setLocation(5, 5);
    }
}