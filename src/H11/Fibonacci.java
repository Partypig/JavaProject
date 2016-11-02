package H11;

import java.applet.*;
import java.awt.*;

/**
 * Created by {Corne Angel} on 27-10-2016.
 */
public class Fibonacci extends Applet{

    int teller;
    int g1 = 1;
    int g2 = 0;
    int g3 = 0;
    int x = 20;
    int y = 20;


    @Override
    public void paint(Graphics g) {
        for (teller = 1; teller < 11; teller++) {
            x += 25;

            g3= g1+g2;
            g1=g2;
            g2=g3;

            g.drawString("" + g3, x, y);

        }
    }
}
