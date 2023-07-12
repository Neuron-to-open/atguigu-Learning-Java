package My;

import javax.swing.*;
import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 1:07
 * @since JDK17
 */
public class MyFrame extends JFrame{
    public MyFrame(String title)
    {
        super(title);

        JPanel root = new JPanel() ;
        this.setContentPane( root );

        //了解即可
//        LayoutManager layout = new FlowLayout() ;
//        root.setLayout(layout);

        //边界布局器
        root.setLayout( new BorderLayout());

        colorLabel label1 = new colorLabel("1" , Color.BLUE) ;
        colorLabel label2 = new colorLabel("2" , Color.BLACK) ;
        colorLabel label3 = new colorLabel("3" , Color.GREEN) ;
        colorLabel label4 = new colorLabel("4" , Color.GRAY) ;


        root.add(label1 , BorderLayout.NORTH) ;
        root.add(label2 , BorderLayout.SOUTH) ;
        root.add(label3 , BorderLayout.EAST) ;
        root.add(label4 , BorderLayout.WEST) ;

        label1.setPreferredSize(new Dimension(0 , 100));
        label3.setPreferredSize(new Dimension(100 , 0));



    }
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
}
