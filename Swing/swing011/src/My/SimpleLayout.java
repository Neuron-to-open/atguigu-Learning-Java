package My;

import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 1:38
 * @since JDK17
 */
public class SimpleLayout extends LayoutAdapter {
    @Override
    public void addLayoutComponent(Component comp, Object constraints) {

    }

    @Override
    public void removeLayoutComponent(Component comp) {

    }

    @Override
    public void layoutContainer(Container parent) {
        int width = parent.getWidth();
        int height = parent.getHeight();
        Component[] children = parent.getComponents();

        int x = 0 ;
        int y = 0 ;
        for(int i = 0 ; i < children.length ; i++)
        {
            Component c = children[i] ;
            c.setBounds(x, y,100 , 100 );
            x += 100 ;
            if(x > width)
            {
                x = 0 ;
                y += 100 ;
            }
        }
    }
}
