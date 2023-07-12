package My;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.beans.SimpleBeanInfo;

public class MyFrame extends JFrame {

    ColorLabel a1 = new ColorLabel("1" , Color.YELLOW) ;
    public MyFrame(String title )
    {
        super(title);
        JPanel root = new JPanel() ;
        this.setContentPane( root );


        root.add(a1) ;

        Border b1 = BorderFactory.createLineBorder(Color.RED , 2) ;
        root.setBorder(b1);

        root.setBorder(BorderFactory.createEmptyBorder(6 , 6 , 6 , 6));


        root.setLayout( new MyCustomLayout ());

    }

    private class MyCustomLayout extends LayoutAdapter
    {

        @Override
        public void addLayoutComponent(Component comp, Object constraints) {

        }

        @Override
        public void removeLayoutComponent(Component comp) {

        }

        @Override
        public void layoutContainer(Container parent) {
            int width = parent.getWidth() ;
            int height = parent.getHeight() ;

            Insets insets = parent.getInsets() ;
            System.out.println("insets = " + insets) ;
            Dimension p_size = a1.getPreferredSize() ;
            a1.setLocation(width - p_size.width - insets.right, insets.top);
            a1.setSize( p_size );
        }
    }
}
