package My;

import javax.swing.*;

/**
 * DATE: 2022/7/18
 * Author: yjy --- BUPT
 */
public class Demo {
    public static void main(String[] args) {

        JFrame frame = new MyFrame("Second ") ;

        frame.setSize(400 , 300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible( true );
    }
}
