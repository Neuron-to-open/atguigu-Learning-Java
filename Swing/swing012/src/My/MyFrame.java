package My;

import javax.swing.*;
import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 11:13
 * @since JDK17
 */
public class MyFrame extends JFrame {


    colorLabel label1 = new colorLabel("1" , Color.BLUE) ;
    colorLabel label2 = new colorLabel("2" , Color.BLACK) ;
    colorLabel label3 = new colorLabel("3" , Color.GREEN) ;
    colorLabel label4 = new colorLabel("4" , Color.GRAY) ;

    public MyFrame (String title)
    {
        super(title) ;


        JPanel root = new JPanel() ;
        this.setContentPane( root );

        root.setLayout(new MyCustomLAyout());

        root.add(label1) ;
        root.add(label2) ;
        root.add(label3) ;
        root.add(label4) ;


    }

    //设计JLabel的属性
    private static class colorLabel extends  JLabel
    {
        public colorLabel(String title , Color rgb)
        {
            this.setText(title);

            this.setOpaque(true);

            this.setBackground(rgb);

            this.setPreferredSize(new Dimension(60 , 30));

            this.setHorizontalAlignment(SwingConstants.CENTER);
        }
    }


    private class MyCustomLAyout extends LayoutAdapter
    {

        @Override
        public void addLayoutComponent(Component comp, Object constraints) {

        }

        @Override
        public void removeLayoutComponent(Component comp) {

        }

        //自定义布局器
        @Override
        public void layoutContainer(Container parent) {
            int width = parent.getWidth() ;
            int height = parent.getHeight() ;
            label1.setLocation(0 , 0);
            label1.setSize(label1.getPreferredSize());

            label2.setLocation(width-label2.getPreferredSize().width , 0);
            label2.setSize(label2.getPreferredSize());

        }
    }
}
