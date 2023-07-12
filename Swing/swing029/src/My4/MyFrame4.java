package My4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * DATE: 2022/7/12
 * Author: yjy --- BUPT
 */
public class MyFrame4 extends JFrame{


    public MyFrame4(String title)
    {
        super(title);

        JPanel root = new JPanel();
        this.setContentPane(root);

        JTextField textField = new JTextField(20);
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
        SimpleDialog dlg = new SimpleDialog( this );

        dlg.setTitle("提示");

        dlg.setModal( true ); // 模态的，即阻塞模式

        dlg.setSize(200, 100);

        dlg.setVisible( true ); // 显示对话框，并阻塞

        System.out.println("....... OK ");
    }


}
