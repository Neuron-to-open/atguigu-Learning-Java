package My;

import javax.swing.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/16 22:14
 * @since JDK17
 */
public class MyDemo {
    public static void main(String[] args) {


        JFrame frame = new MyFrame("hh") ;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400 , 200);

        frame.setVisible(true);
    }
}
