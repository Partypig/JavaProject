package H04;

/**
 * Created by Gebruiker on 12-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class Arc extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawOval(10,10,80,80);
        g.fillArc(10,10,80,80,0,90);
    }
}
