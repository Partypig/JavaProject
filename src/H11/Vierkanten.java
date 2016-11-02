package H11;

import java.applet.*;
import java.awt.*;

/**
 * Created by {Corne Angel} on 28-10-2016.
 */
public class Vierkanten extends Applet {

    int teller;
    int x = 20;
    int y = 20;

    @Override
    public void paint(Graphics g) {
        // teller staat gelijk aan 1; teller moet kleiner dan 11 zijn; teller +1;
        for (teller = 1; teller <11; teller++) {

            // overal komt +50 bij zodat de lijnen langer worden
           g.drawLine(x, y, x, y+50);
            g.drawLine(x, y, x+50, y);
            g.drawLine(x+50, y+50, x+50, y);
            g.drawLine(x+50, y+50, x, y+50);

            x += 50;
            y += 50;
        }
    }
}
