package H11;

import java.applet.*;
import java.awt.*;

/**
 * Created by {Corne Angel} on 28-10-2016.
 */
public class Tafel3 extends Applet {
    int teller;
    int x=50;
    int y=20;
    int tafel = 3;
    int antwoord;
    int nummer;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        while (teller < 10) {
            y += 20;

           nummer++;
           antwoord = tafel*nummer;

           g.drawString(nummer+" x "+ tafel+" = "+antwoord, x, y);
           teller++;
        }
    }
}
