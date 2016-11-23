package H13;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by {Corne Angel} on 23-11-2016.
 */
public class MORETRUMP extends Applet {

    Button[] Knop = new Button[2];
    boolean geklikt1;
    boolean geklikt2;

    @Override
    public void init() {

        Knop[0] = new Button("Trump 1");
        Knop[0].addActionListener(new KnopListener());
        add(Knop[0]);

        Knop[1] = new Button("Trump 2");
        Knop[1].addActionListener(new KnopListener1());
        add(Knop[1]);
    }

    /* Knoppen gemaakt */

    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            geklikt1 = true;
            geklikt2 = false;
            repaint();
        }
    }

    class KnopListener1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            geklikt1 = false;
            geklikt2 = true;
            repaint();
        }
    }

    /* zo geprogrammeerd dat als je op een van de knoppen klikt er iets gebeurt*/

    @Override
    public void paint(Graphics g) {

        Knop[0].setBackground(Color.RED);
        Knop[0].setForeground(Color.WHITE);
        Knop[1].setBackground(Color.GRAY);
        Knop[1].setForeground(Color.WHITE);

        if (geklikt1) {

            setSize(650, 400);

            int x = 50;
            int y = 50;
            int hoogte = 25;
            int breedte = 50;

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

        if (geklikt2) {

            setSize(650, 400);

            int x = 50;
            int y = 25;
            int hoogte = 50;
            int breedte = 75;

            g.setColor(Color.GRAY);
            g.fillRect(x, 75, 525, 250);

            for (int i = 0; i < 4; i++) {
                x = 50;
                y += 50;
                for (int kolom = 0; kolom < 7; kolom++) {
                    g.setColor(Color.white);
                    g.drawRect(x, y, breedte, hoogte);
                    x += 75;
                }

                x = 25;
                y += 50;
                for (int kolom = 0; kolom < 8; kolom++) {
                    g.setColor(Color.white);
                    g.drawRect(x, y, breedte, hoogte);
                    x += 75;
                }
            }
        }
    }

    /* de knopjes kleur gegeven, de booleans een werking gegeven en een extra muur gemaakt
    * op dezelfde manier als bij normale TRUMP*/


}
