package My;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/16 21:39
 * @since JDK17
 */
public class MyFrame extends JFrame {
    JTextField textField = new JTextField(10) ;
    public MyFrame(String title)
    {
        super(title) ;

        JPanel root= new JPanel() ;
        this.setContentPane( root);


        root.add(textField) ;
        textField.setText("yjy are handsome");

        JButton button = new JButton("OK") ;
        root.add(button) ;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test() ;
            }
        });
    }

    public void test()
    {
        String str = textField.getText() ;
        System.out.println(str) ;
    }
}
