import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Swing_JDialog extends JDialog {

    public Swing_JDialog(JFrame jFrame){
        /*
        参数
        1，父窗体对象
        2，对话框标题
        3，是否阻塞父窗体
         */
        super(jFrame,"对话框标题",true);
        Container c = getContentPane(); //获取窗体容器
        Label l = new Label("666");
        l.setForeground(Color.red);
        //System.out.println(l.getText());
        c.add(l);


        setBounds(300,300,300,300);

    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("父窗体");
        jFrame.setBounds(200,200,400,400);
        Container c = jFrame.getContentPane();
        JButton jbt = new JButton("我是一个弹出对话框的按钮");
        c.setLayout(new FlowLayout()); //设置布局，使用流布局
        c.add(jbt);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //添加动作监听
        jbt.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Swing_JDialog s =new Swing_JDialog(jFrame);
                s.setVisible(true);
            }
        });
    }
}
