package Demo;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by {Corne Angel} on 28-9-2016.
 */
public class Rekenmachine extends Applet{

    TextField vak1;
    TextField vak2;
    Button keerKnop;
    Button deelKnop;
    Button plusKnop;
    Button minKnop;

    double getal1;
    double getal2;
    double uitkomst;


    @Override
    public void init() {
        vak1 = new TextField("",20);
        add(vak1);

        vak2 = new TextField("",20);
        add(vak2);

        keerKnop = new Button("X");
        add(keerKnop);
        KeerKnopListener kkl = new KeerKnopListener();
        keerKnop.addActionListener(kkl);

        deelKnop = new Button("/");
        add(deelKnop);
        DeelKnopListener dkl = new DeelKnopListener();
        deelKnop.addActionListener(dkl);

        plusKnop = new Button("+");
        add(plusKnop);
        PlusKnopListener pkl = new PlusKnopListener();
        plusKnop.addActionListener(pkl);

        minKnop = new Button("-");
        add(minKnop);
        MinKnopListener mkl = new MinKnopListener();
        minKnop.addActionListener(mkl);
    }

    class KeerKnopListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1*getal2;

            vak1.setText(""+ uitkomst);
            vak2.setText("");
        }
    }
    class DeelKnopListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1/getal2;

            vak1.setText(""+ uitkomst);
            vak2.setText("");
        }
    }
    class PlusKnopListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1+getal2;

            vak1.setText(""+ uitkomst);
            vak2.setText("");
        }
    }
    class MinKnopListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1-getal2;

            vak1.setText(""+ uitkomst);
            vak2.setText("");
        }
    }
}
