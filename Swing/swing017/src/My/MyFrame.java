package My;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 21:00
 * @since JDK17
 */
public class MyFrame extends JFrame {

    public MyFrame(String title)
    {
        super(title) ;

        JPanel root = new JPanel() ;
        this.setContentPane( root );

        Mycontrol c = new Mycontrol() ;
        root.add(c) ;
        c.setPreferredSize(new Dimension(120, 120));

        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
              if(e.getButton() == MouseEvent.BUTTON1)
              {
                  System.out.println("左键") ;
              }
              if(e.getButton() == MouseEvent.BUTTON2)
              {
                  System.out.println("中键") ;
              }
              if(e.getButton() == MouseEvent.BUTTON3)
              {
                  System.out.println("右键") ;
              }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("released") ;
            }
        });
    }
}
