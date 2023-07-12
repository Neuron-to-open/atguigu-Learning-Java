package MyDemo;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame (String title)
    {
        super(title) ;

        JPanel root = new JPanel() ;
        this.setContentPane( root );

        ColorLabel label1 = new ColorLabel("1" , Color.YELLOW) ;
        ColorLabel label2 = new ColorLabel("2" , Color.CYAN) ;

        root.add(label1) ;
        root.add(label2) ;


        //给label1 设置边框
        Border border1 = new LineBorder(Color.BLUE , 4) ;
        label1.setBorder(border1) ;

        Border border2 = BorderFactory.createLineBorder(Color.RED , 4) ;
        label2.setBorder(border2);




        }

}


