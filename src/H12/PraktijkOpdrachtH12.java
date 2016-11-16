package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by {Corne Angel} on 16-11-2016.
 */
public class PraktijkOpdrachtH12 extends Applet {

    int[] getal;
    String[] naam;
    TextField[] textFields;
    int teller = 0;
    boolean geklikt;


    @Override
    public void init() {
        textFields = new TextField[2];
        getal = new int[10];
        Label label = new Label("Voer naam en telefoonnummer in");
        naam = new String[10];
        Button knop = new Button("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(label);
        for (int i = 0; i < textFields.length; i++) {
            textFields[i] = new TextField("", 10);
            textFields[i].addActionListener(kl);
            add(textFields[i]);
        }
        add(knop);
        setSize(600,400);
    }


    private class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {


            if (teller < 10) {

                naam[teller] = textFields[0].getText();
                getal[teller] = Integer.parseInt(textFields[1].getText());

                teller++;
            } else {
                geklikt = true;
                repaint();
            }
            textFields[0].setText("");
            textFields[1].setText("");
        }
    }


    @Override
    public void paint(Graphics g) {
        if (geklikt) {
            int x = 90;
            int y = 50;
            for (int i = 0; i < getal.length; i++) {
                g.drawString(naam[i] + "   " + getal[i], x, y);
                y += 25;
            }

        }
    }

}
