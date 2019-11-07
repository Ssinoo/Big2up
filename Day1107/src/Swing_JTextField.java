import javax.swing.*;
import java.awt.*;

public class Swing_JTextField extends JFrame {
    public  Swing_JTextField(){
        setBounds(850,300,300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JTextField jt = new JTextField();
        jt.setColumns(20); //设置文本框长度
        jt.setFont(new Font("楷体",Font.PLAIN,20));//设置文体格式

        c.add(jt);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Swing_JTextField();
    }
}
