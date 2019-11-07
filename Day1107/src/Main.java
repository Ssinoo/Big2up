import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class Main extends JDialog {
    public  Main(JFrame jFrame){
        super(jFrame,"海鲜",true);
        Container c = getContentPane(); //获取窗体容器

        c.setBounds(1000,1000,1500,1500);

        Label l = new Label("海鲜披萨");
        JButton jp = new JButton("price"),
                js = new JButton("size"),
                jn = new JButton("num");
        c.setLayout(new FlowLayout());
        c.add(jp);
        c.add(js);
        c.add(jn);
        c.setVisible(true);
    }



    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(200,200,200,200);
        jFrame.setTitle("披萨店");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = jFrame.getContentPane();
        JButton j1 = new JButton("海鲜披萨"),
                j2 = new JButton("培根披萨");
        c.setLayout(new FlowLayout());
        c.add(j1);
        c.add(j2);
        jFrame.setVisible(true);
        j1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main s =new Main(jFrame);
                s.setVisible(true);
            }
        });




        Pizza sp = new SeaPizza();
        sp.setName("海鲜披萨");
        sp.setPrice(100);
        sp.setSize(100);

        Pizza pp = new PeiPizza();
        pp.setName("培根披萨");
        pp.setPrice(50);
        pp.setSize(50);

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入想要的披萨：1，海鲜披萨 2，培根披萨 ");
            int i = sc.nextInt();
            if (i == 1) {
                sp.show();
                System.out.println("请输入培根数量");
                int num = sc.nextInt();
                System.out.println("数量为" + num);

                System.out.println("一份的价格为" + sp.getPrice());
                System.out.println("总价格为" + (num * sp.getPrice()));

            } else if (i == 2) {
                pp.show();
                System.out.println("请输入培根数量");
                int num = sc.nextInt();
                System.out.println("数量为" + num);
                System.out.println("一份的价格为" + pp.getPrice());
                System.out.println("总价格为" + (num * pp.getPrice()));
            } else {
                System.out.println("请重新输入");
            }
        }
    }


}
