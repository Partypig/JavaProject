package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by {Corne Angel} on 3-11-2016.
 */
public class Knopjes extends Applet{

    Button[] knop;

    @Override
    public void init() {
        knop = new Button[25];
        for (int i = 0; i < knop.length; i++){
            knop[i] = new Button("" + i);
            add(knop[i]);
        }


    }




}
