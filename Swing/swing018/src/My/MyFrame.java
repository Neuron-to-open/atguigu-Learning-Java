package My;

import javax.swing.*;
import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 21:59
 * @since JDK17
 */
public class MyFrame extends JFrame {

    public MyFrame(String title)
    {
        super(title);

        JPanel root = new JPanel() ;
        this.setContentPane( root );

        HandDraw h = new HandDraw() ;
        root.add(h) ;

        h.setPreferredSize(new Dimension(120,120));


    }
}
