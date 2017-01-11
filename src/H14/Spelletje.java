package H14;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

/**
 * Created by {Corne Angel} on 8-12-2016.
 */
public class Spelletje extends Applet {

    int spel = 23;
    int halp1;
    int halp2;
    TextField nummer;
    Button knop;
    Button reset;
    int getal;
    boolean geklikt;
    boolean gewonnen;
    boolean verloren;
    boolean start = true;
    boolean winface;
    Image woah;
    Image cat;
    Image pogchamp;
    Image triggered;
    URL pad;
    Boolean ok =true;


    public void init() {
        reset = new Button("Reset");
        reset.addActionListener(new Reset());
        setSize(300, 500);

        knop = new Button("Speel");
        knop.addActionListener(new Teller());

        nummer = new TextField("", 5);
        nummer.addActionListener(new Teller());

        add(reset);
        add(nummer);
        add(knop);

        pad = Spelletje.class.getResource("/Fuk u/");
        woah = getImage(pad, "Woah.jpg");
        cat = getImage(pad, "Cat.jpg");
        pogchamp = getImage(pad, "PogChamp.jpg");
        triggered = getImage(pad, "Triggered.gif");

    }

    public class Reset implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            spel = 23;
            verloren = false;
            gewonnen = false;
            start = true;
            winface = false;
            ok =true;
            repaint();
        }
    }

    public class Teller implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            updateStuff();
        }
    }

    public void updateStuff() {
        int invoer = 0;
        if (ok) {
            invoer = Integer.valueOf(nummer.getText());
        }

        nummer.setText("");
        if (invoer > 0 && invoer < 4 && spel > 0 && spel >= invoer) {
            spel -= invoer;
            halp2 = invoer;
            halp1 = 69;

            geklikt = true;
            if (spel != 21 && spel > 20) {
                int hulp = spel - 21;
                spel -= hulp;
                winface = true;
            } else if (spel != 17 && spel > 16 && spel < 21) {
                int hulp = spel - 17;
                spel -= hulp;
                winface = true;
            } else if (spel != 13 && spel > 12 && spel < 17) {
                int hulp = spel - 13;
                spel -= hulp;
                winface = true;
            } else if (spel != 9 && spel > 8 && spel < 13) {
                int hulp = spel - 9;
                spel -= hulp;
                winface = true;
            } else if (spel != 5 && spel > 4 && spel < 9) {
                int hulp = spel - 5;
                spel -= hulp;
                winface = true;
            } else if (spel != 1 && spel > 0 && spel < 5) {
                int hulp = spel - 1;
                spel -= hulp;
                winface = true;
            } else {
                int random = new Random().nextInt(3) + 1;
                spel -= random;
                getal = random;
                halp1 = getal;
                halp2 = 69;
                repaint();
            }
            //win/lose
            if (spel <= halp2 && halp1 == 69) {
                geklikt = false;
                start = false;
                gewonnen = false;
                verloren = true;
                ok =false;
            }
            if (spel <= halp1 && halp2 == 69) {
                geklikt = false;
                start = false;
                gewonnen = true;
                verloren = false;
                ok =false;
            }
        }

        repaint();

    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        if (start) {
            if (geklikt) {
                g.drawString("De computer pakt: " + getal + " icons", x, y);
                y += 25;
            }
            g.drawString("Aantal Icons: " + spel, x, y);

        }


        int x2 = 50;
        int y2 = 35;

        for (int i = 0; i < spel; i++) {
            if (i % 4 == 0) {
                x2 = 50;
                y2 += 50;
            }
            if (winface) {
                g.drawImage(cat, x2, y2, 50, 50, this);
            } else {
                g.drawImage(pogchamp, x2, y2, 50, 50, this);
            }
            x2 += 50;
        }


        //on win :D
        if (gewonnen) {
            g.drawString("You Win!", 50, 50);
            g.drawImage(woah, 50, 60, 200, 200, this);
        }
        //on lose D:
        if (verloren) {
            g.drawString("You Lost!", 50, 50);
            g.drawImage(triggered, 50, 60, 200, 200, this);
        }

    }
}