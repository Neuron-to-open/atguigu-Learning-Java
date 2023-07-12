package My;

import javax.swing.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/16 22:46
 * @since JDK17
 */
public class MyDemo {
    public static void main(String[] args) {

        JFrame frame = new MyFrame("hh") ;

        frame.setSize(300, 400);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
