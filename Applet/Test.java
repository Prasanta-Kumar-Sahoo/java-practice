import java.applet.*;
import java.awt.*;
/*<applet code = "Test.class" 
width = 300 height =500/>*/

class Test extends Applet {
    String msg = "";

    public void init() {
        msg += " inside init";
    }

    public void start() {
        msg += " inside start";
    }

    public void paint(Graphics g) {
        msg += " inside paint";
        g.drawString(msg, 50, 10);
    }

    public void stop() {
        msg += " inside stop";
    }

    public void destroy() {
        msg += "inside destroy ";
    }
}