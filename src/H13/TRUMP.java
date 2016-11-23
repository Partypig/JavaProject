package H13;

import java.applet.*;
import java.awt.*;

/**
 * Created by {Corne Angel} on 18-11-2016.
 */
public class TRUMP extends Applet {

    @Override
    public void paint(Graphics g) {

        int x = 50;
        int y = 50;
        int hoogte = 25;
        int breedte = 50;

        setSize(650, 400);

         /* de setsize ding staat ervoor dat als je de applet start en het vergroot niet gek
          gaat trippen */

        g.setColor(Color.RED);
        g.fillRect(x, y+25, 500, 250);

        for (int i = 0; i < 5; i++) {
            x = 50;
            y += 25;
            for (int kolom = 0; kolom <10; kolom++) {
                g.setColor(Color.white);
                g.drawRect(x, y, breedte, hoogte);
                x += 50;
            }
            x = 25;
            y += 25;
            for (int kolom = 0; kolom <11; kolom++) {
                g.setColor(Color.white);
                g.drawRect(x, y, breedte, hoogte);
                x += 50;
            }
        }
    }
    /* de eerste loop is de grootte witte steen en de 2de is de kleine witte steen */
}
