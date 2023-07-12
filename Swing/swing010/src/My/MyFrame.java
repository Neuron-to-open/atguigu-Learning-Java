package My;

import javax.swing.*;
import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 1:30
 * @since JDK17
 */
public class MyFrame extends JFrame {

    public MyFrame (String title)
    {
        super(title);

        JPanel root = new JPanel() ;
        this.setContentPane( root );

        root.setLayout(null);

        colorLabel label1 = new colorLabel("1" , Color.BLUE) ;
        colorLabel label2 = new colorLabel("2" , Color.BLACK) ;
        colorLabel label3 = new colorLabel("3" , Color.GREEN) ;
        colorLabel label4 = new colorLabel("4" , Color.GRAY) ;

        root.add(label1) ;
        label1.setBounds(300 , 0 ,60 ,30);

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
