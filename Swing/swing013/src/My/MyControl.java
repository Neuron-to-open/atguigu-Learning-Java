package My;

import javax.swing.*;
import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 15:08
 * @since JDK17
 */
public class MyControl extends JPanel{



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = this.getWidth() ;
        int height = this.getHeight() ;

        g.setColor(new Color(255 , 0,0 , 100));
        g.fillRect(0, 0, 60, 30);
    }
}
