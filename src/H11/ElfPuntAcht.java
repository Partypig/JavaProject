package H11;

import java.applet.*;
import java.awt.*;

/**
 * Created by {Corne Angel} on 31-10-2016.
 */
public class ElfPuntAcht extends Applet {

    int teller;
    int x = 10;
    int y = 10;
    int h = 10;

    @Override
    public void paint(Graphics g) {
        for (teller= 1; teller <101; teller++) {
            g.drawOval(x, y, h, h);

            h += 10;
        }
    }
}
