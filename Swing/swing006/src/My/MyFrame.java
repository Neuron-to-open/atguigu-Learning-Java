package My;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/16 22:15
 * @since JDK17
 */
public class MyFrame extends JFrame {
    JComboBox<String> colofield = new JComboBox<>() ;
    JButton button = new JButton("测试") ;
    public MyFrame(String title)
    {
        super(title) ;

        JPanel root = new JPanel() ;
        this.setContentPane( root );


        //
        colofield.addItem("red");
        colofield.addItem("yellow");
        colofield.addItem("blue");
        root.add(colofield) ;

        root.add( button) ;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test() ;
            }
        });

        colofield.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test2() ;
            }
        });
    }

    public void test()
    {
        int count = colofield.getItemCount() ;
        String value = colofield.getItemAt(0) ;
        System.out.println(value) ;
    }

    public void test2()
    {
        System.out.println(" i love you ") ;
    }
}
