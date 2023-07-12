package My;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/16 17:40
 * @since JDK17
 */
public class MyFrame extends JFrame{

    JLabel label = new JLabel("00:00:00") ;
    public MyFrame(String title)
    {
        super(title) ;
        JPanel root = new JPanel() ;
        this.setContentPane( root) ;

        JButton button = new JButton("测试") ;
        root.add(button) ;

        root.add(label) ;

//        MyActionListener listener = new MyActionListener() ;
//        button.addActionListener(listener); ;

        button.addActionListener(new MyActionListener());


    }

    private class MyActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("**按键被被点击了") ;

            SimpleDateFormat sdf = new SimpleDateFormat("HH : mm : ss");
            String timestr = sdf.format(new Date()) ;
            System.out.println(timestr) ;

            label.setText(timestr);
        }
    }
}
