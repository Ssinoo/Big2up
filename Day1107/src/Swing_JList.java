import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_JList extends JFrame {
    public Swing_JList(){
        setBounds(300,300,300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        String items[] = {"one","two","three","four","five","six"};
        //JList<String> jl = new JList<>(items); //元素添加入JList

        DefaultListModel<String> dlm =new DefaultListModel<>(); //列表框的数据模型

        for (String default1:
                items
             ) {
            dlm.addElement(default1);
        }
        dlm.addElement("seven");
        JList<String> jl = new JList<>(dlm); //列表框载入数据模型
        c.add(jl);

        JScrollPane js = new JScrollPane(jl); //为坐标添加滚动条
        js.setBounds(40,40,80,80);
        c.add(js);
        JButton jb =new JButton("确定");
        jb.setBounds(150,40,80,80);
        jb.addActionListener(new ActionListener() { //按钮的动作监听
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jl.getSelectedValue());
            }
        });
        c.add(jb);


        setVisible(true);
    }

    public static void main(String[] args) {
        new Swing_JList();
    }

}
