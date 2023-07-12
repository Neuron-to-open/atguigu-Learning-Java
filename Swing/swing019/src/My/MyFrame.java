package My;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 22:35
 * @since JDK17
 */
public class MyFrame extends JFrame {

    public MyFrame (String title)
    {
        super(title);

        JPanel root = new JPanel() ;
        this.setContentPane( root );

        colorLabel a1 = new colorLabel("1" , Color.GREEN);
        colorLabel a2 = new colorLabel("2" , Color.WHITE) ;

       root.add(a1) ;
       root.add(a2) ;

        Border border1 = new LineBorder(Color.BLUE , 10) ;
        a1.setBorder(border1);


        Border border2 = new LineBorder(Color.RED , 10) ;
        a2.setBorder(border2);
    }
}
