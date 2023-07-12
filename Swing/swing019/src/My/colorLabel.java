package My;

import javax.swing.*;
import java.awt.*;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 22:35
 * @since JDK17
 */
public class colorLabel extends JLabel
{
    public colorLabel(String title , Color rgb)
    {
        this.setText(title);

        this.setOpaque(true);

        this.setBackground(rgb);

        this.setPreferredSize(new Dimension(60 , 30));

        this.setHorizontalAlignment(SwingConstants.CENTER);
    }
}
