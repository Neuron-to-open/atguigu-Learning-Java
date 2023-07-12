package My;

import javax.swing.*;
import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 21:02
 * @since JDK17
 */
public class MyDemo {
    public static void main(String[] args) {

        JFrame frame = new MyFrame("yjy") ;

        frame.setVisible(true);

        frame.setSize(400,300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
