package H04;

/**
 * Created by Gebruiker on 11-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
       /* g.drawRect(240,240,325,325);
        g.drawLine(240,240,500,110);
        g.drawLine(390,110,530,220);*/
       g.drawLine(270,300,380,250);
        g.drawLine(380,250,495,300);
       // g.drawLine(500,298,270,300);
        g.drawRect(270,300,225,190);
        g.drawRect(327,410,30,30);
        g.drawRect(423,415,40,75);


    }
}
