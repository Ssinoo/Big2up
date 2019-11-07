import javax.swing.*;
import java.awt.*;

public class Swing_JLabel extends JFrame {
    public Swing_JLabel(){
        setBounds(300,300,200,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        JLabel j = new JLabel("这是一个图片的标签");
        c.add(j);

        Icon ic =  new ImageIcon("D://杂物堆//abc.jpg");
        j.setIcon(ic);




    }
    public static void main(String[] args) {
        new Swing_JLabel();
    }
}
