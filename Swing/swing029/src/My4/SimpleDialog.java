package My4;

import javax.swing.*;
import java.awt.*;

/**
 * DATE: 2022/7/12
 * Author: yjy --- BUPT
 */
public class SimpleDialog extends  JDialog{

    public SimpleDialog( Window owner  )
    {
        // 调用父类的构造方法，进行初始化
        super ( owner );

        //
        JPanel root = new JPanel();
        this.setContentPane( root );

        //
        JLabel label = new JLabel("恭喜通关!");
        root.add( label );
    }

}
