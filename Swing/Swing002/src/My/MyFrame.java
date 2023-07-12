package My;

import javax.swing.*;

/**
 * DATE: 2022/7/18
 * Author: yjy --- BUPT
 */
public class MyFrame extends JFrame {
    public MyFrame(String title)
    {
        super(title) ;
        JPanel root = new JPanel() ;
        this.setContentPane( root );

        JButton button = new JButton("你好") ;
        root.add( button ) ;
    }
}
