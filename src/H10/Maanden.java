package H10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by {Corne Angel} on 30-9-2016.
 */
public class Maanden extends Applet {

    TextField nummer;
    int maand;
    String s, tekst;
    Label label;

    @Override
    public void init() {
        nummer = new TextField("",20);
        label = new Label("Type het maandnummer en druk op enter");
        nummer.addActionListener(new TekstvakListener());
        tekst= "";
        add(label);
        add(nummer);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(tekst,50,70);
    }

    class TekstvakListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            s= nummer.getText();
            maand = Integer.parseInt( s);
            switch(maand) {
                case 1:
                    tekst = "Januari, 31 dagen";
                    break;
                case 2:
                    tekst = "Februari, 31 dagen";
                    break;
                case 3:
                    tekst = "Maart, 31 dagen";
                    break;
                case 4:
                    tekst = "April, 30 dagen";
                    break;
                case 5:
                    tekst = "Mei, 31 dagen";
                    break;
                case 6:
                    tekst = "Juni, 30 dagen";
                    break;
                case 7:
                    tekst = "Juli, 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus, 31 dagen";
                    break;
                case 9:
                    tekst = "September, 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober, 31 dagen";
                    break;
                case 11:
                    tekst = "November, 30 dagen";
                    break;
                case 12:
                    tekst = "December, 31 dagen";
                    break;
            }
            repaint();

        }
    }
}
