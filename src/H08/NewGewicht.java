package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by {Corne Angel} on 23-9-2016.
 */
public class NewGewicht extends Applet{


    //Variabelen maken
    int V;
    int V2;
    int V3;
    int H,H2,H3;
    int J;
    int J2;
    int J3;

    TextField vak1;
    TextField vak2;
    TextField vak3;

    Label label1;
    Label label2;
    Label label3;
    Button knop;


    public void init() {

        //Variabelen een waarde geven
        V = 40;
        J = 100;
        H = 80;

        //rekensom voor gewicht
        V2 = 400-(2*V);
        V3 = 2*V;
        H2 = 400-(2*H);
        H3 = 2*H;
        J2 = 400-(2*J);
        J3 = 2*J;

        vak1 = new TextField("",20);
        vak2 = new TextField("",20);
        vak3 = new TextField("",20);

        label1 = new Label("Valerie");
        label2 = new Label("Jeroen");
        label3 = new Label("Hans");

        knop = new Button("bereken");
        BerekenKnopListener bkl = new BerekenKnopListener();
        knop.addActionListener(bkl);

        add(label1);
        add(vak1);
        add(label2);
        add(vak2);
        add(label3);
        add(vak3);
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawLine(139, 201, 139, 390);
        g.drawLine(139,390,411,390);

        //Valerie haar waardes
        g.setColor(Color.blue);
        g.drawString("Valarie",160,400);
        g.fillRect(160,V2,20,V3-10);

        //Jeroen zijn waardes
        g.setColor(Color.black);
        g.drawString("Jeroen",220,400);
        g.fillRect(220,J2,20,J3-10);

        //Hans zijn waardes
        g.setColor(Color.red);
        g.drawString("Hans",280,400);
        g.fillRect(280,H2,20,H3-10);

        //waardes
        g.setColor(Color.black);
        g.drawString("0",135,400);
        g.drawString("20",125,360);
        g.drawString("40",125,320);
        g.drawString("60",125,280);
        g.drawString("80",125,240);
        g.drawString("100",125,200);

    }
    class BerekenKnopListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            V= Integer.parseInt(vak1.getText());
            J= Integer.parseInt(vak2.getText());
            H= Integer.parseInt(vak3.getText());
            V2 = 400-(2*V);
            V3 = 2*V;
            H2 = 400-(2*H);
            H3 = 2*H;
            J2 = 400-(2*J);
            J3 = 2*J;

            repaint();

        }
    }


}
