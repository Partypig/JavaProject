package Demo;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gebruiker on 14-9-2016.
 */
public class Variabelen extends Applet {

    Color achtergrondKleur;
    Color tekstKleur;
    int getal1;
    int getal2;
    Font mijnFont;

    @Override
    public void init() {
        super.init();
        achtergrondKleur = new Color(255,204,204);
        tekstKleur = new Color(0,32,128);
        getal1 = 20;
        getal2 = 30;
        setBackground(achtergrondKleur);
        mijnFont = new Font("TimesRoman", Font.BOLD, 35);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(tekstKleur);
        int x = 50;
        int y = 50;
        g.setFont(mijnFont);
        g.drawString("Som is: " + (getal1 + getal2), x, y );
        y = y + 20;
        g.drawString("Som is: " + (getal1 * getal2), x, y );

    }
}



