package My;

import javax.swing.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/16 21:53
 * @since JDK17
 */
public class MyDemo {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame("hh") ;

        frame.setSize(300 , 400);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
