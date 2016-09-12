package H04;

import java.awt.*;

/**
 * Created by Gebruiker on 11-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Flag extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(314, 198, 20, 200);
        g.fillRect(314,198,20,200);
        g.setColor(Color.red);
        g.drawRect(333,198,80,40);
        g.fillRect(333,198,80,40);
        g.setColor(Color.blue);
        g.drawRect(333,258,80,40);
        g.fillRect(333,258,80,40);
    }
}