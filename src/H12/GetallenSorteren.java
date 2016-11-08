package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by {Corne Angel} on 3-11-2016.
 */
public class GetallenSorteren extends Applet{

   TextField[] tekstvelden;
   int[] getallen;
   Button knop;

    //^ alle dingetjes gemaakt

    @Override
    public void init() {

        tekstvelden = new TextField[5];
        getallen = new int[5];
        knop = new Button("BOOP");

        for (int i = 0; i < tekstvelden.length; i++){
            tekstvelden[i] = new TextField("", 5);
            add(tekstvelden[i]);
        }

        // ^ = 5 tekstvelden in 3 zinnen

        add(knop);
        knop.addActionListener(new KnopListener());
    }

    // ^ waardes geven aan de dingetjes

    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {


            for (int i = 0; 1 < tekstvelden.length; i++) {
                String invoer = tekstvelden[i].getText();
                getallen[i] = Integer.parseInt(invoer);
            }

            Arrays.sort(getallen);

            for (int i = 0; i < getallen.length; i++) {
                tekstvelden[i].setText(String.valueOf(getallen[i]));
            }
            // zorgt ervoor dat alle getallen gesorteerd worden
        }
    }
}