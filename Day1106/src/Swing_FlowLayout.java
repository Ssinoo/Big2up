import javax.swing.*;
import java.awt.*;

public class Swing_FlowLayout extends JFrame {
    public Swing_FlowLayout(){
        setBounds(200,200,200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(new FlowLayout());

        for (int i = 0; i <10 ; i++) {
            c.add(new Button(""+i));
        }


        setVisible(true);
    }
    public static void main(String[] args) {
        new Swing_FlowLayout();
    }


}
