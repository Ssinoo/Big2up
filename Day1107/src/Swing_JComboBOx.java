import javafx.scene.control.ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Swing_JComboBOx  extends JFrame {
    public Swing_JComboBOx(){
        setBounds(300,300,300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        String items[] = {"海鲜披萨","培根披萨"};
        JComboBox<String> comboBox = new JComboBox<>(items); //创建下拉列表模型
        comboBox.setBounds(20,20,80,22);
        comboBox.setEditable(false);
        c.add(comboBox);

        JButton jbt= new JButton("选择");
        jbt.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你选择的是"+comboBox.getSelectedItem());
            }

        });
        jbt.setBounds(140,20,80,22);
        c.add(jbt);




        setVisible(true);

    }
    public static void main(String[] args) {
        new Swing_JComboBOx();
    }
}
