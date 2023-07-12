package My;

import javax.swing.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 1:39
 * @since JDK17
 */
public class MyDemo {
    public static void main(String[] args) {

        JFrame frame = new MyFrame("yjy") ;

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400 , 300);
    }
}
