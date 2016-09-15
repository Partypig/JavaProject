package H05;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gebruiker on 15-9-2016.
 */
import java.awt.*;
import java.applet.*;



public class PraktijkopdrachtMetVariabelen extends Applet{
    Color achtergrondkleur;
    Color tekstkleur;
    Color lijnkleur;
    Color fillkleur;
    int hoogte;
    int breedte;



        public void init() {
            achtergrondkleur = Color.white;
            tekstkleur = Color.black;
            lijnkleur = Color.black;
            fillkleur = Color.magenta;
            hoogte = 80;
            breedte = 300;
        }

        public void paint(Graphics g){

            //lijn
            g.drawLine(6,5,320,5);
            g.drawString("Lijn",160,16);

            //Rechthoek
            g.drawRect(6,70,300,80);
            g.drawString("Rechthoek",160,161);

            //Afgeronde rechthoek
            g.drawRoundRect(6,200,300,80,30,30);
            g.drawString("Afgeronde Rechthoek",160,291);

            //Gevulde rechthoek met ovaal
            g.setColor(Color.magenta);
            g.fillRect(375,70,300,80);
            g.setColor(Color.black);
            g.drawOval(375,70,300,80);
            g.drawString("Gevulde rechthoek met ovaal",490,161);

            //Gevulde ovaal
            g.drawOval(375,200,300,80);
            g.setColor(Color.magenta);
            g.fillOval(375,200,300,80);
            g.setColor(Color.black);
            g.drawString("Gevulde ovaal",500,291);

            //Taartpunt met ovaal eromheen
            g.drawOval(700,70,300,80);
            g.setColor(Color.magenta);
            g.fillArc(700,70,300,80,0,45);
            g.setColor(Color.black);
            g.drawString("Taartpunt met ovaal eromheen",800,161);

            //Cirkel
            g.drawOval(800,200,80,80);
            g.drawString("Cirkel",825,291);
        }
    }


