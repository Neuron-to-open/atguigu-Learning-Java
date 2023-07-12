package My;

import javax.swing.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/18 2:50
 * @since JDK17
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyFrame extends JFrame
{

    public MyFrame(String title)
    {
        super(title);

        //根容器
        JPanel root = new JPanel();
        this.setContentPane(root);

        //文本框
        JTextField textField = new JTextField(20);

        JButton button = new JButton("测试");
        root.add(textField);
        root.add(button);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                test2();
            }
        });

    }


    // 简单消息提示框
    private void test1()
    {
        JOptionPane.showMessageDialog(this, "操作已经完成！");
        System.out.println("test1 exit");
    }

    // 简单确认输入框
    private void test2()
    {
        int select = JOptionPane.showConfirmDialog(this,
                "是否确认删除?",
                "确认",
                JOptionPane.YES_NO_OPTION);

        // select 为用户点的第几个按钮
        if(select == 0)
        {
            System.out.println("模拟执行数据删除操作...");
            System.out.println("删除完成");
        }

        System.out.println("test2 exit");
    }

    // 简单数据输入框
    private void test3()
    {
        String input = JOptionPane.showInputDialog(
                this,
                "请输入你的身份证号\n (字母以X代替)",
                "0000");
        if(input != null)
        {
            System.out.println("输入的号码为: " + input);
        }
        System.out.println("test3 exit");
    }



}

