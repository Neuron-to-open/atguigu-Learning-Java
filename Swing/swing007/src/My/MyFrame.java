package My;

import javax.print.attribute.HashPrintJobAttributeSet;
import javax.swing.*;
import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/16 23:00
 * @since JDK17
 */
public class MyFrame extends JFrame {

    public MyFrame(String title)
    {
        super(title) ;

        JPanel root = new JPanel() ;
        this.setContentPane( root );

        JLabel label = new JLabel() ;
        root.add(label) ;

        label.setText("你好");

        label.setFont(new Font("微软雅黑" , Font.BOLD , 18)); //字体、风格（粗细）、自字号

        label.setForeground(new Color(0 , 255 , 0)); //字体RGB颜色
        label.setOpaque(true); //背景不透明才可以设置颜色
        label.setBackground(new Color(0,255,255));// 背景色

        label.setPreferredSize(new Dimension(160,30)); //控件大小

        label.setHorizontalAlignment(SwingConstants.CENTER);//居中对齐
    }
}
