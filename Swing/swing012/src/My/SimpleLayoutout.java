package My;

import java.awt.*;
import java.util.ArrayList;
import java.util.List ;
/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 11:15
 * @since JDK17
 */
public class SimpleLayoutout extends LayoutAdapter {


    List<Component> list = new ArrayList<>() ;

    @Override
    public void addLayoutComponent(Component comp, Object constraints) {
        list.add(comp);
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        list.remove(comp);
    }

    @Override
    public void layoutContainer(Container parent) {

        int width = parent.getWidth();
        int height = parent.getHeight();

        int x = 0 ;
        int y = 0 ;
        for(int i = 0 ; i < list.size() ; i++)

        {
            Component c = list.get(i) ;
            c.setBounds(x, y , 60 ,30);
            x += 100 ;
            if(x >100)
            {
                x = 0 ;
                y+= 100 ;
            }
        }



    }
}
