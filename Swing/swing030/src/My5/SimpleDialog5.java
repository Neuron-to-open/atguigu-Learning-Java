package My5;

import javax.swing.*;
import java.awt.*;

/**
 * DATE: 2022/7/12
 * Author: yjy --- BUPT
 */
public class SimpleDialog5 extends JDialog {

    JTextField userInput = new JTextField(10);

    public SimpleDialog5( Window owner  )
    {
        // 调用父类的构造方法，进行初始化
        super ( owner );

        //
        JPanel root = new JPanel();
        this.setContentPane( root );

        //
        JLabel label = new JLabel("请输入");
        root.add( label );

        //
        root.add(userInput);
    }

    public String getValue()
    {
        String str = userInput.getText();
        return str;
    }
}
