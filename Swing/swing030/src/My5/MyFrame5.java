package My5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * DATE: 2022/7/12
 * Author: yjy --- BUPT
 */
public class MyFrame5 extends JFrame {

    JTextField textField = new JTextField(20);

    public MyFrame5(String title)
    {
        super(title);

        JPanel root = new JPanel();
        this.setContentPane(root);


        JButton button = new JButton("测试");
        root.add(textField);
        root.add(button);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                test();
            }
        });

    }

    private void test()
    {
        SimpleDialog5 dlg = new SimpleDialog5( this );

        dlg.setTitle("提示");

        dlg.setModal( true ); // 模态的，即阻塞模式

        dlg.setSize(250, 150);

        // 1 显示对话框，并阻塞等待
        dlg.setVisible( true ); // 显示对话框，并阻塞

        // 2 对话框被关闭了，
        System.out.println("....... OK ");

        // 3 取得对话框里的输入的值，显示到主窗口里
        String input = dlg.getValue();
        this.textField.setText(input);
    }



}
