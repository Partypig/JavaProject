package H13;

import java.applet.*;
import java.awt.*;

/**
 * Created by {Corne Angel} on 23-11-2016.
 */
public class PraktijkOpdrachtH13 extends Applet {

    Color bruin = new Color(115,64, 35);

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        for (int rij = 0; rij < 2; rij++) {

            for (int i = 0; i < 5; i++) {
                g.setColor(Color.GREEN);
                g.fillOval(x, y, 50, 50);
                x += 55;
                g.setColor(bruin);
                g.fillRect(x - 35, y + 49, 10, 25);
            }

            x = 50;
            y += 100;
        }
    }
}
