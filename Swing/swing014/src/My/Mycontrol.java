package My;

import javax.swing.*;
import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 15:38
 * @since JDK17
 */
public class Mycontrol extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = this.getWidth() ;
        int height = this.getHeight() ;

        g.setColor(new Color(255 , 255 ,255) );
        g.fillRect(0, 0, width , height);
//        System.out.println(width) ;
//        System.out.println(height);

        g.setColor(new Color(0,0,255));
        g.fillRect(0 , 0 , 100 , 50);

        g.setColor(Color.RED);
        g.fillOval(100 , 50 , 100 ,100);

        g.setColor(Color.PINK);
        g.fillArc(150, 150 , 100 , 100, 0 , 120);

        g.setColor(Color.GREEN);
        g.drawRect(60,60,100,50);
    }
}
