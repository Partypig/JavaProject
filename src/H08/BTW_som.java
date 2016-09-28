package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by {Corne Angel} on 23-9-2016.
 */

public class BTW_som extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    Button Ok;
    String s;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        Ok = new Button ("Ok");
        Ok.addActionListener( new KnopListener());

        add(label);
        add(tekstvak);
        add (Ok);

        s = "";
    }

    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal*121/100, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble(s);
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Double.parseDouble( s );
            repaint();

        }
    }
}