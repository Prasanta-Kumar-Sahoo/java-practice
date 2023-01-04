import java.applet.*;
import java.awt.*;
/*        <applet code="test.class" width="300" height="500">
            <param name="Vname" value="Ramesh">
            <param name="Vage" value="32">
        </applet> */

public class Test2 {
    String name, age;

    public void start() {
        name = getParameter("Vname");
        age = getParametor("Vage");
    }

    public void paint(Graphics g) {
        g.drawString("name :- " + name, 50, 100);
        g.drawString("age :- " + age, 50, 100);
    }
}
