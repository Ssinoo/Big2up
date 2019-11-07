import javax.swing.*;
import java.awt.*;

public class Swing_BorderLayout extends JFrame {
    public  Swing_BorderLayout(){
        setBounds(500,500,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new BorderLayout()); //设置边界对象

        JButton b1 = new JButton("center"),
                b2 = new JButton("east"),
                b3 = new JButton("west"),
                b4 = new JButton("south"),
                b5 = new JButton("north");
        c.add(b1 ,BorderLayout.CENTER);
        c.add(b4,BorderLayout.SOUTH);
        c.add(b2,BorderLayout.EAST);
        c.add(b3,BorderLayout.WEST);
        c.add(b5,BorderLayout.NORTH);


        setVisible(true);
    }
    public static void main(String[] args) {
        new Swing_BorderLayout();
    }

}
