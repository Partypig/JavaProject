package H06;

/**
 * Created by Gebruiker on 16-9-2016.
 */
import java.awt.*;
import java.applet.*;


public class VerdientGeld extends Applet{

    //variabelen
    int Geld;
    int Geld2;

    @Override
    //variabelen een waarde geven
    public void init() {
        super.init();
        Geld = 113;
        Geld2 = Geld / 4;
    }

        //Het totale aantal wat iedereen krijgt
        public void paint(Graphics g) {
            super.paint(g);
            g.drawString("totaal "+Geld+",-",10,20);
            g.drawString("Jan krijgt: "+ Geld2 + ",- totaal",10,50);
            g.drawString("Ali krijgt: "+ Geld2 + ",- totaal",10,80);
            g.drawString("Jeanette krijgt: "+ Geld2 + ",- totaal",10,110);
            g.drawString("Corne krijgt: "+ Geld2 + ",- totaal",10,140);
    }




}
