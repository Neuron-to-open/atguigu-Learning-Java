package Test;

import javax.swing.*;
import java.awt.*;

/**
 * DATE: 2022/7/19
 * Author: yjy --- BUPT
 */
public class MyFrame extends JFrame {

    public MyFrame(String title)
    {
        super(title) ;
        JPanel root = new JPanel() ;
        this.setContentPane( root );

        //设置为布局管理器
        root.setLayout(new BorderLayout());

        JButton button1 = new JButton("上") ;
        JButton button2 = new JButton("左") ;
        JButton button3 = new JButton("中") ;
        JButton button4 = new JButton("右") ;
        JButton button5 = new JButton("下") ;

        root.add(button1 , BorderLayout.NORTH) ;
        root.add(button2 , BorderLayout.WEST) ;
        root.add(button3 , BorderLayout.CENTER) ;
        root.add(button4 , BorderLayout.EAST) ;
        root.add(button5 , BorderLayout.SOUTH) ;

    }
}
