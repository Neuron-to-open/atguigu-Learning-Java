package My13;

import javax.swing.*;
import java.awt.*;

/**
 * DATE: 2022/7/13
 * Author: yjy --- BUPT
 */
public class MyDemo13 {

    public static void main(String[] args)
    {
        JFrame frame = new MyFrame13 ("列表框测试");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 450);

        // 显示在屏幕中央
        centerInScreen(frame);

        frame.setVisible(true);
    }

    public static void centerInScreen(Window win)
    {
        // 获取屏幕大小
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // 显示在屏幕的中央
        int x = ( screenSize.width - win.getWidth())/2;
        int y = ( screenSize.height - win.getHeight())/2;
        win.setLocation(x,  y);
    }
}
