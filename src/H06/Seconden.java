package H06;

/**
 * Created by Gebruiker on 16-9-2016.
 */
import java.awt.*;
import java.applet.*;


public class Seconden extends Applet {

    //variabelen
    int uur;
    int dag;
    int jaar;

    //berekening
    public void init() {
        uur = 1;
        dag = 1;
        jaar = 1;

        uur = uur * 3600;
        dag = dag * 86400;
        jaar = jaar * 31536000;

    }
//De tekst maken
    @Override
    public void paint(Graphics g) {
        g.drawString("Uur: " + uur +" seconden",20,20);
        g.drawString("Dag: " + dag +" seconden",20,40);
        g.drawString("Jaar: " + jaar +" seconden",20,60);
    }
}

