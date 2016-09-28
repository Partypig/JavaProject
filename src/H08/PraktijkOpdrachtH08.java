package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by {Corne Angel} on 23-9-2016.
 */
public class PraktijkOpdrachtH08 extends Applet{

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    TextField getal1;
    TextField getal2;
    String s1;
    String s2;
    double d1;
    double d2;
    double d3;

    @Override
    public void init() {

        //tekstvelden
        getal1 = new TextField("",15);
        getal2 = new TextField("",15);

        //knopjes
        b1 = new Button("*");
        b1.addActionListener( new Button1());

        b2 = new Button("/");
        b2.addActionListener( new Button2());

        b3 = new Button("+");
        b3.addActionListener( new Button3());

        b4 = new Button("-");
        b4.addActionListener( new Button4());

        //doubles een waarde geven


        //alles zichtbaar maken
        add(getal1);
        add(getal2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

    }
    class Button1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = getal1.getText();
            s2 = getal2.getText();

            d1 = Double.parseDouble(s1);
            d2 = Double.parseDouble(s2);
            d3 = d1*d2;

            String s3 = String.valueOf(d3);
            getal1.setText(s3);
            getal2.setText("");

            repaint();
        }
    }
    class Button2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = getal1.getText();
            s2 = getal2.getText();

            d1 = Double.parseDouble(s1);
            d2 = Double.parseDouble(s2);
            d3 = d1/d2;

            String s3 = String.valueOf(d3);
            getal1.setText(s3);
            getal2.setText("");

            repaint();
        }
    }
    class Button3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = getal1.getText();
            s2 = getal2.getText();

            d1 = Double.parseDouble(s1);
            d2 = Double.parseDouble(s2);
            d3 = d1+d2;

            String s3 = String.valueOf(d3);
            getal1.setText(s3);
            getal2.setText("");

            repaint();
        }
    }
    class Button4 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = getal1.getText();
            s2 = getal2.getText();

            d1 = Double.parseDouble(s1);
            d2 = Double.parseDouble(s2);
            d3 = d1-d2;

            String s3 = String.valueOf(d3);
            getal1.setText(s3);
            getal2.setText("");

            repaint();
        }
    }
}
