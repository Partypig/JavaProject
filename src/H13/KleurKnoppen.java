package H13;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by {Corne Angel} on 17-11-2016.
 */
public class KleurKnoppen extends Applet {

    Button[] Knop = new Button[5];
    String Kleur;

    @Override
    public void init() {

        Knop[0] = new Button("Blauw");
        Knop[0].addActionListener(new KnopListener());
        add(Knop[0]);

        Knop[1] = new Button("Groen");
        Knop[1].addActionListener(new KnopListener1());
        add(Knop[1]);

        Knop[2] = new Button("Geel");
        Knop[2].addActionListener(new KnopListener2());
        add(Knop[2]);

        Knop[3] = new Button("Rood");
        Knop[3].addActionListener(new KnopListener3());
        add(Knop[3]);

        Knop[4] = new Button("Roze");
        Knop[4].addActionListener(new KnopListener4());
        add(Knop[4]);
    }

    /* hierboven heb ik alle knoppen gemaakt
    en hieronder zorg ik ervoor dat als je op ze klikt
    er tekst verschijnt
     */

    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Kleur = "De kleur van deze knop = Blauw";
            repaint();
        }
    }

    class KnopListener1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Kleur = "De kleur van deze knop = Groen";
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Kleur = "De kleur van deze knop = Geel";
            repaint();
        }
    }

    class KnopListener3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Kleur = "De kleur van deze knop = Rood";
            repaint();
        }
    }

    class KnopListener4 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Kleur = "De kleur van deze knop = Roze";
            repaint();
        }
    }

    /* hieronder ga ik ervoor zorgen dat als je op de knoppen
    gedrukt hebt ze ook daadwerkelijk hun kleuren krijgen
     */

    @Override
    public void paint(Graphics g) {

        Knop[0].setBackground(Color.BLUE);
        Knop[1].setBackground(Color.GREEN);
        Knop[2].setBackground(Color.YELLOW);
        Knop[3].setBackground(Color.RED);
        Knop[4].setBackground(Color.PINK);

        int x = 50, y = 50;
        g.drawString(Kleur,x,y);
    }

    /* de x en y staan erbij zodat op x =50 en y =50 de tekst komt te staan */
}
