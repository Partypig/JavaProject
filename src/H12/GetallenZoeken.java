package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by {Corne Angel} on 8-11-2016.
 */
public class GetallenZoeken extends Applet{

    int [] getallen = {55, 44, 58, 102, 23, 37, 31, 52, 17};

    TextField tekst;
    Button knop;
    String schermtekst;

    @Override
    public void init() {

        tekst = new TextField("", 8);
        add(tekst);
        knop = new Button("Kies");
        knop.addActionListener(new KnopListener());
        add(knop);
        schermtekst = "";
    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 80;

        g.drawString(schermtekst, x, y);
    }

    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(tekst.getText());
            boolean isgevonden = false;
            int index = 0;
            for (int i = 0; i < getallen.length; i++) {
                if (getallen[i] == invoer){
                    isgevonden = true;
                    index = i;
                }
            }

            // ^ de boolean zorgt ervoor dat elk nummer gezogt wordt en als het er niet is
            // dan is het false als het dan bijv 55 is dan is het true

            if (isgevonden) {
                schermtekst = "Waarde is gevonden. Index is " + index;
            } else {
                schermtekst = "Waarde is niet gevonden. Index is " + index;
            }

            repaint();
        }


    }
}
