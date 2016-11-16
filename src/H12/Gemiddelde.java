package H12;

import java.applet.*;
import java.awt.*;

/**
 * Created by {Corne Angel} on 16-11-2016.
 */
public class Gemiddelde extends Applet {

    int[] cijfers ={10,8,9,7,5,6,4,2,3,1};
    double antwoord;

    //alle int enzo = tien random getallen

    @Override
    public void init() {
        for (int i = 0; i <cijfers.length; i++) {
            antwoord = antwoord + cijfers[i];

        }

        antwoord = (antwoord)/cijfers.length*10;
        int antwoord2 = (int) antwoord;
        antwoord = (double) antwoord2 /10;

    }

    //alles wordt gesorteerd/gechecked

    @Override
    public void paint(Graphics g) {
        int x = 30;
        int y = 10;

        g.drawString("Het gemiddelde is: "+antwoord,x+25,y);
        y+=20;
        for (int i = 0; i <cijfers.length; i++) {
            x+=25;
            g.drawString(""+cijfers[i],x,y);
        }
    }

    //het gemiddelde word berekend
}
