package My;

import javax.swing.*;
import java.awt.*;

public class ColorLabel extends  JLabel {

    public ColorLabel(String title , Color rgb)
    {

        this.setText(title);

        this.setOpaque(true);

        this.setBackground(rgb);

        this.setPreferredSize(new Dimension(60 , 30));

        this.setHorizontalAlignment(SwingConstants.CENTER);

    }

}
