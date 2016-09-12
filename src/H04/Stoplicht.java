package H04;

/**
 * Created by Gebruiker on 12-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet{

    public void init() {
    }

    public void paint(Graphics g){
        //stoplicht skelet
        g.drawRect(299,168,40,120);
        g.fillRect(299,168,40,120);
        g.drawRect(310,289,20,200);
        g.fillRect(310,289,20,200);

        //stoplicht lampen
        g.setColor(Color.red);
        g.drawOval(310,185,20,20);
        g.fillArc(310,185,20,20,0,360);
        g.setColor(Color.yellow);
        g.drawOval(310,220,20,20);
        g.fillArc(310,220,20,20,0,360);
        g.setColor(Color.green);
        g.drawOval(310,250,20,20);
        g.fillArc(310,250,20,20,0,360);

    }


}
