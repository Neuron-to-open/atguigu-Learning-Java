package My;

import javax.swing.*;
import java.awt.*;

/**
 * DATE: 2022/7/18
 * Author: yjy --- BUPT
 */
import java.awt.Color;
import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;

public class BackGround {
    //设置窗口
    JFrame f = new JFrame("panel test");
    //设置按钮
    JLabel label=new JLabel("ABC");
    public BackGround(){
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);
        label.setBounds(80, 50, 100, 80);
        //第四层
        Container root = (JRootPane) f.getRootPane();
        root.setBackground(Color.green);
        //第三层
        Container layer=f.getLayeredPane();
        layer.setBackground(Color.yellow);
        //第二层
        Container content = (JPanel) f.getContentPane();
        content.setBackground(Color.orange);
        //第一层
        JComponent glass=(JComponent) f.getGlassPane();
        glass.setBackground(Color.red);
        //添加组件
        content.setLayout(null);
        content.add(label);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new BackGround();
    }
}