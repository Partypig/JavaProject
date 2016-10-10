package H10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

/**
 * Created by {Corne Angel} on 30-9-2016.
 */
public class Maanden extends Applet {

    //    maand
    TextField Maandnummer;
    Label maand;
    Button B1;
    int Maandint;
    String Ms;
    //    jaar
    TextField Jaarnummer;
    Label jaar;
    int Jaarint;
    String Js;
    String Feb;


    @Override
    public void init() {
        super.init();

        ButtonListener bl = new ButtonListener();
        AnotherClass ac = new AnotherClass();
        Maandnummer = new TextField("", 5);
        Maandnummer.addActionListener(bl);
        maand = new Label("Maand");
        B1 = new Button("Enter");
        B1.addActionListener(bl);
        B1.addActionListener(ac);
        jaar = new Label("Jaar");
        Jaarnummer = new TextField("", 5);
        Jaarnummer.addActionListener(ac);

        add(jaar);
        add(Jaarnummer);

        add(maand);
        add(Maandnummer);
        add(B1);
        Ms="";
        Js="";
    }

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if ( (Jaarint % 4 == 0 && !(Jaarint % 100 == 0)) ||
                    Jaarint % 400 == 0 ) {

                Feb = "28";
            }
            else {

                Feb = "29";
            }

            Maandint = Integer.parseInt(Maandnummer.getText());
            switch (Maandint) {
                case 1:
                    Ms = "Januari, 31 Dagen";
                    break;
                case 2:
                    Ms = "Febuari, " +Feb+ " Dagen"; // moet aangepast worden tijdens schirkkeljaar
                    break;
                case 3:
                    Ms = "Maart, 31 Dagen";
                    break;
                case 4:
                    Ms = "April, 30 Dagen";
                    break;
                case 5:
                    Ms = "Mei, 31 Dagen";
                    break;
                case 6:
                    Ms = "Juni, 30 Dagen";
                    break;
                case 7:
                    Ms = "Juli, 31 Dagen";
                    break;
                case 8:
                    Ms = "Augustus, 31 Dagen";
                    break;
                case 9:
                    Ms = "September, 30 Dagen";
                    break;
                case 10:
                    Ms = "Oktober, 31 Dagen";
                    break;
                case 11:
                    Ms = "November, 30 Dagen";
                    break;
                case 12:
                    Ms = "December, 31 Dagen";
                    break;
                default:
                    Ms = "Ongeldige maand!";
                    break;
            }
            Maandnummer.setText("");
            repaint();
        }
    }
    class AnotherClass implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {



            Jaarint =Integer.parseInt(Jaarnummer.getText());

            if ( (Jaarint % 4 == 0 && !(Jaarint % 100 == 0)) ||
                    Jaarint % 400 == 0 ) {
                Js = ""+ Jaarint + " is een schrikkeljaar";
                Feb = "28";
            }
            else {
                Js = ""+ Jaarint + " is geen schrikkeljaar";
                Feb = "29";
            }
            Jaarnummer.setText("");
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawString(""+ Ms,80,50);
        g.drawString(""+Js,80,80);
    }
}