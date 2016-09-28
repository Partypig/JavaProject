package H08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by {Corne Angel} on 22-9-2016.
 */
public class Knop extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    String s;

    //Alles een waarde geven
    public void init() {
        tekstvak = new TextField("Klik hier", 20);
        knop = new Button("Ok");
        knop2 = new Button("Reset");
        knop.addActionListener( new KnopListener() );
        knop2.addActionListener( new KnopListener2());

        add(tekstvak);
        add(knop);
        add(knop2);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );
    }

    //Reset knop programmeren
    class KnopListener2 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            s = "";
            repaint();
        }
    }

    //OK knop programmeren
    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            repaint();
        }
    }
}
