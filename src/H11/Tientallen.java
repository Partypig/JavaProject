package H11;

import java.applet.*;
import java.awt.*;

/**
 * Created by {Corne Angel} on 27-10-2016.
 */
public class Tientallen extends Applet {

    @Override
    public void init() {}

    @Override
    public void paint(Graphics g) {
        int teller = 10;
        int y = 0;

        while(teller < 20) {
            y += 20;
            g.drawString("" + teller, 305, y );
            teller++;
        }
    }
}
