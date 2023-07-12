package My;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * DATE: 2022/7/12
 * Author: yjy --- BUPT
 */
public class MyFrame extends JFrame {

    JTextField textField = new JTextField(20);
    JButton button = new JButton("测试");

    public MyFrame(String title)
    {
        super(title);

        JPanel root = new JPanel();
        this.setContentPane(root);

        root.add(textField);
        root.add(button);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                test3();
            }
        });

    }


    // 选择打开文件
    private void test1()
    {
        JFileChooser chooser = new JFileChooser();

        //FileNameExtensionFilter: 文件名后缀过滤器
        FileNameExtensionFilter filter = new FileNameExtensionFilter("图片文件", "jpg", "jpeg", "png","tif");
        chooser.setFileFilter(filter);

        // 显示对话框
        int ret = chooser.showOpenDialog(this);
        // 获取用户选择的结果
        // APPROVE_OPTION表示用户确认了选择， CANCEL_OPTION表示取消了操作
        if (ret == JFileChooser.APPROVE_OPTION)
        {
            // 结果为：已经存在的一个文件
            File file = chooser.getSelectedFile();
            textField.setText(file.getAbsolutePath());
        }
    }

    // 选择保存文件
    private void test2()
    {
        JFileChooser chooser = new JFileChooser();

        //FileNameExtensionFilter: 文件名后缀过滤器
        FileNameExtensionFilter filter = new FileNameExtensionFilter("XML文件", "xml");
        chooser.setFileFilter(filter);

        // 显示对话框 showSaveDialog
        int ret = chooser.showSaveDialog(this);
        // 获取用户选择的结果
        if (ret == JFileChooser.APPROVE_OPTION)
        {
            // 结果为：用户要保存的文件的路径
            File file = chooser.getSelectedFile();
            textField.setText(file.getAbsolutePath());
        }
    }

    // 选择目录
    private void test3()
    {
        JFileChooser chooser = new JFileChooser();

        // 设置模式：仅选择目录
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        // 显示对话框
        int ret = chooser.showOpenDialog(this);
        // 获取用户选择的结果
        if (ret == JFileChooser.APPROVE_OPTION)
        {
            // 结果为： 已经存在的一个目录
            File dir = chooser.getSelectedFile();
            textField.setText(dir.getAbsolutePath());
        }
    }
}
