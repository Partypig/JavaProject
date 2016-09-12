package H04;

/**
 * Created by Gebruiker on 12-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet{

    public void init (){
    }

    public void paint(Graphics g){
        //dobbelsteen vierkant
        g.drawRoundRect(267,191,240,240,10,10);

        //dobbelsteen punten
        g.setColor(Color.black);
        g.fillOval(307,239,40,40);
        g.fillOval(429,239,40,40);
        g.fillOval(307,330,40,40);
        g.fillOval(429,330,40,40);
    }
}
