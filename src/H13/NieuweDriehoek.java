package H13;

import java.applet.*;
import java.awt.*;

/**
 * Created by {Corne Angel} on 18-11-2016.
 */
public class NieuweDriehoek extends Applet {

    int x1, x2, x3, y1, y2;

    @Override
    public void init() {
        x1 = 80;
        x2 = 10;
        x3 = 150;
        y1 = 10;
        y2 = 100;
    }

    @Override
    public void paint(Graphics g) {
        tekenDriehoek(g, x1, y1, x2, y2, x3);
    }

    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3) {
        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y2);
        g.drawLine(x3,y2,x1,y1);

    }
}
