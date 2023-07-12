package My;

import javax.swing.*;
import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 15:37
 * @since JDK17
 */
public class MyFrame extends JFrame {

    public MyFrame(String title)
    {
        super(title) ;

        JPanel root = new JPanel() ;
        this.setContentPane( root );

        Mycontrol c = new Mycontrol() ;
        c.setPreferredSize(new Dimension(300 , 250));
        root.add( c ) ;
    }
}
