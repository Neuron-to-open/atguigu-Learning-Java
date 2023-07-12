package My;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/16 21:53
 * @since JDK17
 */
public class MyFrame extends JFrame {
    JButton button = new JButton("下一步") ;
    JCheckBox agreeFiled = new JCheckBox("同意用户协议") ;
    public MyFrame(String title)
    {
        super(title) ;

        JPanel root = new JPanel() ;
        this.setContentPane( root );


        root.add(agreeFiled) ;

        root.add(button) ;

        //界面初始化
        agreeFiled.setSelected(false);
        button.setEnabled( false );

        //checkbox时间处理
        agreeFiled.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test() ;
            }
        });
    }

    public void test()
    {
        if(agreeFiled.isSelected())
        {
            button.setEnabled(true);
        }else {
            button.setEnabled(false);
        }
    }
}
