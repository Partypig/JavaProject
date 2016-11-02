package H11;


import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by {Corne Angel} on 31-10-2016.
 */
public class PraktijkOpdracht1 extends Applet {

    TextField nummer;
    Button knop1;
    Button knop2;
    Label tekst;
    int x = 20;
    int y = 20;
    int tafel = 3;
    boolean start;


    @Override
    public void init() {
        tekst = new Label("Voer een nummer in ");

        KnopListener b1 = new KnopListener();
        nummer = new TextField("", 20);
        nummer.addActionListener(b1);

        knop1 = new Button("OK");
        knop1.addActionListener(b1);

        Knop2Listener b2 = new Knop2Listener();
        knop2 = new Button("Next");
        knop2.addActionListener(b2);

        add(tekst);
        add(nummer);
        add(knop1);
        add(knop2);

    }



    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            tafel = Integer.valueOf(nummer.getText());
            nummer.setText("");
            start = true;
            repaint();
        }
    }
    class Knop2Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            tafel++;
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {

        if (start){
            for (int teller=1; teller <=10; teller++){
                y += 20;

                int antwoord = tafel * teller;
                g.drawString(teller + " x " + tafel + " = " + antwoord, x, y);
            }
            y=30;
        }
    }
}