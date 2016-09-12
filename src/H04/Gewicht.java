package H04;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gebruiker on 11-9-2016.
 */


        import java.awt.*;
        import java.applet.*;

public class Gewicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(139, 201, 139, 390);
        g.drawLine(139,390,411,390);
        //Valerie haar waardes
        g.setColor(Color.blue);
        g.drawString("Valarie",160,400);
        g.drawRect(160,314,20,76);
        g.fillRect(160,314,20,76);
        //Jeroen zijn waardes
        g.setColor(Color.black);
        g.drawString("Jeroen",220,400);
        g.drawRect(220,201,20,190);
        g.fillRect(220,201,20,190);
        //Hans zijn waardes
        g.setColor(Color.red);
        g.drawString("Hans",280,400);
        g.drawRect(280,240,20,150);
        g.fillRect(280,240,20,150);
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