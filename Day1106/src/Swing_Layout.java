import javax.swing.*;
import java.awt.*;

public class Swing_Layout extends JFrame {

    public Swing_Layout(){
        setBounds(300,300,300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(null); //设为绝对布局
        JButton j1 = new JButton("one ");
        JButton j2 = new JButton("two");
        j1.setBounds(200,200,200,200);
        j2.setBounds(150,150,150,150);
        c.add(j1);
        c.add(j2);


        setVisible(true);

    }
    public static void main(String[] args) {
        new Swing_Layout();

    }
}
