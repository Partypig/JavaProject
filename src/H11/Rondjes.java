package H11;

import java.applet.*;
import java.awt.*;

/**
 * Created by {Corne Angel} on 28-10-2016.
 */
public class Rondjes extends Applet{

    int teller;
    int x = 60;
    int y = 60;
    int h = 10;

    @Override
    public void paint(Graphics g) {
      for (teller = 1; teller <6; teller++) {
          g.drawOval(x, y, h, h);

          // bij de x,y gaat er steeds 5 af zodat de cirkel op een ander
          // punt begint; en bij de h komt er steeds 10 bij zodat
          // het een steeds kleiner rondje wordt

          x-= 5;
          y-= 5;
          h+= 10;
      }
    }
}
