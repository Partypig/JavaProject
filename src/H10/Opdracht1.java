package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by {Corne Angel} on 29-9-2016.
 */
 public class Opdracht1 extends Applet {

    TextField getal1;
    TextField getal2;
    TextField tekstvak;

    double d1;
    double d2;

    Button b1;

    String s;



    public void init() {
        TekstvakListener tl = new TekstvakListener();
        getal1 = new TextField("",20);
        getal1.addActionListener(tl);
        getal2 = new TextField("",20);
        getal2.addActionListener(tl);
        b1 = new Button("Enter");
        b1.addActionListener(tl);

        add(getal1);
        add(getal2);
        add(b1);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString("" + d1 + " is groter dan " + d2 + ": " + (d1 > d2), 50, 60 );
        g.drawString("" + d1 + " is kleiner dan " + d2 + ": " + (d1 < d2), 50, 80 );
    }


    class TekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            d1 = Double.parseDouble(getal1.getText());
            d2 = Double.parseDouble(getal2.getText());
            repaint();
        }
    }
}





