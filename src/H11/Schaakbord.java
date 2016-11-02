package H11;

import java.applet.*;
import java.awt.*;

/**
 * Created by {Corne Angel} on 31-10-2016.
 */
public class Schaakbord extends Applet {

    int x ;
    int y = 0;
    int breedte = 30;
    int hoogte = 30;

    @Override
    public void paint(Graphics g) {
        setBackground(Color.gray);
        for (int repeat = 0; repeat < 4; repeat++) {
            y += 30;
            x = 50;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }

            //tweede rij
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
        }
    }
}

