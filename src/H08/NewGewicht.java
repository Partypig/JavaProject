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

}
