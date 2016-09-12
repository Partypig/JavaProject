package H02;

/**
 * Created by Gebruiker on 9-9-2016.
 */
import java.awt.*;
        import java.applet.*;

public class Show extends Applet {

    public void init() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawString("Corné", 50, 60 );
        g.setColor(Color.RED);
        g.drawString("Angel", 50, 70 );
    }
}
