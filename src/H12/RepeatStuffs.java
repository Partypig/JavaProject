package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by {Corne Angel} on 16-11-2016.
 */
public class RepeatStuffs extends Applet {

    boolean geklikt, gevonden;
    int[] salaris = { 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 4, 4, 5, 5, 5 };
    int hoevaak;
    TextField tekstvak;

    //alle int en stuffs

    public void init() {

        tekstvak = new TextField("",5);
        add(tekstvak);

        Button knop = new Button("OK");
        add(knop);
        Knoplisterner kl = new Knoplisterner();
        knop.addActionListener(kl);
        tekstvak.addActionListener(kl);
    }

    //tekstvak + knop programmeren

    private class Knoplisterner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer = tekstvak.getText();
            int getal = Integer.parseInt(invoer);
            gevonden = false;
            geklikt = true;
            hoevaak = 0;
            for (int i = 0; i < salaris.length; i++) {
                if (salaris[i] == getal) {
                    gevonden = true;
                    hoevaak++;
                }
            }
            repaint();
        }
    }

    //boolean programmeren en knop verder uitwerken

    public void paint(Graphics g) {

        if (geklikt) {
            if (gevonden == true) {
                g.drawString("De waarde komt " + hoevaak + " keer voor.", 20, 50);
            } else {
                g.drawString("De waarde is niet gevonden.", 20, 50);
            }
        }
    }

    //de uitkomsten laten zien

}
