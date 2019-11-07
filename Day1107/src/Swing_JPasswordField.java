import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_JPasswordField extends JFrame {
    public Swing_JPasswordField(){
        setBounds(850,400,300,300 );
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JPasswordField jpwf = new JPasswordField(20);//columns设置密码框长度
        jpwf.setBounds(200,400,250,250);
        jpwf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               char[] chars = jpwf.getPassword(); //获取密码的字符数组
                String password = new String(chars);
                System.out.println("密码是"+password);

            }
        });

        c.add(jpwf);

        setVisible(true);
    }

    public static void main(String[] args) {
         new Swing_JPasswordField();
    }
}
