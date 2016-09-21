package H06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by {Corne Angel} on 21-9-2016.
 */
public class PostitiefNegatief extends Applet{

    //variabelen
    int a;
    int b;
    int uitkomst;


    @Override
    public void init() {
        a = 2147483647;
        b = 20;
        uitkomst = a + b;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("" + uitkomst,20,20);
    }
}
