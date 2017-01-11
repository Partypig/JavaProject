package H14;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by {Corne Angel} on 5-12-2016.
 */
public class Kaarten extends Applet {

    Button knop;
    String[] kleurtjes = {"Harten", "Ruiten", "Schoppen", "Klaver"};
    String[] getallen = {"Aas", "Koning", "Vrouw", "Boer", "Tien", "Negen", "Acht", "Zeven", "Zes", "Vijf", "Vier", "Drie", "Twee"};
    boolean geklikt;
    int i;
    int i2;

    @Override
    public void init() {

        knop = new Button("Deel Kaart");
        knop.addActionListener(new Knoppie());
        add(knop);
    }

    @Override
    public void paint(Graphics g) {

        if(geklikt) {
            g.drawString("De kaart is: " + kleurtjes[i2] + " " + getallen[i],50,50);
        }

    }

    class Knoppie implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Random random = new Random();
            int r = random.nextInt(13);
            i = r;

            int r2 = random.nextInt(4);
            i2 = r2;

            repaint();
            geklikt = true;
        }
    }
    /* de i en i2 zorgen ervoor dat de nummers en de soorten kaarten allemaal
    * gerandomised worden*/
}

