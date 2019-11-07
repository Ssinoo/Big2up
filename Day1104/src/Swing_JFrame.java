import javax.swing.*;
import java.awt.*;

/*
        JFrame 窗体对象
 */
public class Swing_JFrame extends JFrame{

    public Swing_JFrame(){

        setTitle("我是窗口");
        setVisible(true);

        /* EXIT_ON_CLOSE 隐藏窗口，并停止程序
           DO_NOTHING_ON_CLOSE 无任何操作
           HIDE_ON_CLOSE    隐藏，不停止操作
           DISPOSE_ON_CLOSE  释放窗体资源

        */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setSize(300,200);//设置窗体大小，单位，像素
//        jFrame.setLocation(300,300);//设置坐标
        setBounds(300,300,300,300);//setBound=setSize+setLocation
        Container container = getContentPane();//获取窗体容器
        container.setBackground(Color.YELLOW);//设置背景颜色
        JLabel jLabel = new JLabel("嘤嘤嘤");
        container.add(jLabel);

        setResizable(false); // 设置是否可以改变窗口大小

    }
    public static void main(String[] args) {

        new Swing_JFrame();
    }
}
