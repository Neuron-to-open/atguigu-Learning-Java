package My;

import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 10:40
 * @since JDK17
 */
public abstract class LayoutAdapter implements LayoutManager2 {
//    @Override
//    public void addLayoutComponent(Component comp, Object constraints) {
//
//    }
//    @Override
//    public void removeLayoutComponent(Component comp) {
//
//    }

    @Override
    public Dimension maximumLayoutSize(Container target) {
        return null;
    }

    @Override
    public float getLayoutAlignmentX(Container target) {
        return 0;
    }

    @Override
    public float getLayoutAlignmentY(Container target) {
        return 0;
    }

    @Override
    public void invalidateLayout(Container target) {

    }

    @Override
    public void addLayoutComponent(String name, Component comp) {

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;
    }

//    @Override
//    public void layoutContainer(Container parent) {
//
//    }
}
