
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myapp extends JFrame {
    Container cn;
    JLabel t, t1, t2, t3;
    ImageIcon m;
    JTextField f, f1;
    JPasswordField p;

    public Myapp(String tnm) {
        cn = getContentPane();
        setName(tnm);
        // cn.setBackground(Color.ORANGE);
        cn.setForeground(Color.RED);
        cn.setBackground(Color.BLUE);
        setLayout(null);
        m = new ImageIcon("flower.jpg");
        t = new JLabel("welcome to my application..");
        t.setBounds(300, 50, 500, 30);
        t.setForeground(Color.GREEN);
        cn.add(t);
        t1 = new JLabel("Made In India");
        t1.setForeground(Color.ORANGE);
        t1.setBounds(900, 50, 100, 30);
        cn.add(t1);
        t2 = new JLabel(m);
        t2.setBounds(660, 100, 1200, 1000);
        cn.add(t2);

        // testfield

        t3 = new JLabel("Enter Name ");
        t3.setForeground(Color.ORANGE);
        t3.setBounds(50, 100, 100, 30);
        cn.add(t3);

        f = new JTextField("First Name");
        f.setForeground(Color.ORANGE);
        f.setBounds(200, 100, 100, 30);
        cn.add(f);

        t3 = new JLabel("Enter Password ");
        t3.setForeground(Color.ORANGE);
        t3.setBounds(50, 150, 100, 30);
        cn.add(t3);

        p = new JPasswordField()67;
        p.setForeground(Color.ORANGE);
        p.setBounds(200, 150, 100, 30);
        cn.add(p);

        // f1 = new JTextField("Last Name");
        // f1.setForeground(Color.ORANGE);
        // f1.setBounds(200, 100, 100, 30);
        // cn.add(f1);
        setSize(1000, 1200);
        setVisible(true);

    }
}

public class Test {

    public static void main(String[] args) {
        new Myapp("my window");
    }
}