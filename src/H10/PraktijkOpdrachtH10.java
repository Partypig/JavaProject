package H10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by {Corne Angel} on 6-10-2016.
 */
public class PraktijkOpdrachtH10 extends Applet {

    TextField tekstveld;
    Button knop;

    double invoer;
    double totaal;

    double gemiddelde;

    int aantalcijfers;

    boolean geklikt;

    @Override
    public void init() {
        tekstveld = new TextField("", 5);
        add(tekstveld);

        knop = new Button("Ok");
        add(knop);
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 60;

        if (geklikt) {
            if ( invoer < 5.5 ) {
                g.drawString("Het cijfer is onvoldoende ", x,y);
            } else {
                g.drawString("Het cijfer is voldoende ", x,y);
            }

            y = y + 20;
            g.drawString("Gemiddelde" + gemiddelde, x,y);
        }


    }

    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstveld.getText();
            invoer = Double.parseDouble(s);

            totaal += invoer;
            // of totaal = totaal + invoer

            aantalcijfers++;
            // is aantalcijfers = aantaalcijfers + 1;

            gemiddelde = totaal / aantalcijfers;
            geklikt=true;

            repaint();

        }
    }
}