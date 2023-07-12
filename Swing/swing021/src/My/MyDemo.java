package My;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/18 2:49
 * @since JDK17
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new MyFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
