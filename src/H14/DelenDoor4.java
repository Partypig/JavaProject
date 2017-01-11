package H14;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by {Corne Angel} on 7-12-2016.
 */
public class DelenDoor4 extends Applet {

    Button knopje;
    boolean geklikt;
    String[] kleurtjes = {"Harten", "Ruiten", "Schoppen", "Klaver"};
    String[] getallen = {"Aas", "Koning", "Vrouw", "Boer", "Tien", "Negen", "Acht", "Zeven", "Zes", "Vijf", "Vier", "Drie", "Twee"};
    String[] deck = new String[52];
    String[]s1 = new String[13];
    String[]s2 = new String[13];
    String[]s3 = new String[13];
    String[]s4 = new String[13];

    @Override
    public void init() {

        knopje = new Button("Deel de Kaarten");
        knopje.addActionListener(new Knopske());
        add(knopje);
    }

    public String deel(){

        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        String[] deck2 = new String[deck.length - 1];
        int index = 0;

        for (int i = 0; i < deck.length; i++){
            if (i != random){
                deck2[index] = deck[i];
                index++;
            }
        }

        deck = deck2;
        return kaart;
    }

    class Knopske implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            geklikt = true;
            deck = new String[52];
            int index = 0;

            for (int i = 0; i < kleurtjes.length; i++){
                String kleur = kleurtjes[i];
                for (int j = 0; j < getallen.length; j++){
                    String kaart = getallen[j];
                    deck[index] = kleur + " " + kaart;
                    index++;
                }
            }

            for(int i = 0; i < 13; i++){
                s1[i] = deel();
                s2[i] = deel();
                s3[i] = deel();
                s4[i] = deel();
            }

            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {

        int x1 = 50;
        int x2 = 250;
        int x3 = 450;
        int x4 = 650;
        int y1 = 70;
        int y2 = 110;

        if(geklikt == true){
            g.drawString("Speler 1", x1, y1);
            g.drawString("Speler 2", x2, y1);
            g.drawString("Speler 3", x3, y1);
            g.drawString("Speler 4", x4, y1);

            for(int i = 0; i < 13; i++){
                g.drawString(s1[i], x1, y2);
                g.drawString(s2[i], x2, y2);
                g.drawString(s3[i], x3, y2);
                g.drawString(s4[i], x4, y2);
                y2 += 25;
            }
        }
    }
}
