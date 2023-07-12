package My;

import javax.swing.*;
import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 15:14
 * @since JDK17
 */
public class MyFrame extends JFrame {

    public MyFrame(String title)
    {
        super(title);

        JPanel root = new JPanel() ;
        this.setContentPane( root );

        MyControl control = new MyControl() ;
//        control.setPreferredSize(new Dimension(100 , 50));
        root.add(control) ;
    }
}
