package H11;

import java.applet.*;
import java.awt.*;

/**
 * Created by {Corne Angel} on 26-10-2016.
 */
public class Lijnen extends Applet {

    @Override
    public void init() {}

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int teller;
        int x = 0;

        for(teller = 0; teller < 10; teller++) {
            x += 20;
            g.drawLine(x, 50, x, 300 );

        }
    }
}
