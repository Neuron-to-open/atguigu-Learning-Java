package My;

import javax.swing.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/16 17:39
 * @since JDK17
 */
public class MyDemo {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("hh") ;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400, 300);

        frame.setVisible(true);



    }
}
