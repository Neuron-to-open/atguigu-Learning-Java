package Test;

import javax.swing.*;

/**
 * DATE: 2022/7/19
 * Author: yjy --- BUPT
 */
public class Demo {

    public static void main(String[] args) {

        JFrame frame = new MyFrame("第三个GUI程序") ;
        frame.setVisible(true);
        frame.setSize(400 , 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
