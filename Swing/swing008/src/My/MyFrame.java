package My;

import javax.swing.*;
import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 0:52
 * @since JDK17
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) {
        super(title) ;

        JPanel root = new JPanel() ;
        this.setContentPane( root );



        colorLabel label1 = new colorLabel("1" , Color.BLUE) ;
        colorLabel label2 = new colorLabel("2" , Color.BLACK) ;
        colorLabel label3 = new colorLabel("3" , Color.GREEN) ;

//        JLabel label1 = new JLabel("1");
//        label1.setOpaque(true);
//        label1.setBackground(Color.YELLOW);
//        label1.setPreferredSize(new Dimension(60 , 30));
//        label1.setHorizontalAlignment(SwingConstants.CENTER);
//
//        JLabel label2 = new JLabel("2") ;
//        label2.setOpaque(true);
//        label2.setBackground(Color.RED);
//        label2.setPreferredSize(new Dimension(60 , 30));
//        label2.setHorizontalAlignment(SwingConstants.CENTER);
//
//        JLabel label3 = new JLabel("3") ;
//        label3.setOpaque(true);
//        label3.setBackground(Color.GREEN);
//        label3.setPreferredSize(new Dimension(60 , 30));
//        label3.setHorizontalAlignment(SwingConstants.CENTER);
//
        root.add(label1) ;
        root.add(label2) ;
        root.add(label3) ;
    }


    private static class colorLabel extends JLabel
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
