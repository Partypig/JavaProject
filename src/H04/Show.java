package H04;

/**
 * Created by Gebruiker on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.drawLine(400,250,300,360);
        g.drawLine(300,360,500,460);
        g.drawLine(500,460,400,250);



    }
}