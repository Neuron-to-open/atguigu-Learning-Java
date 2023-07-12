package My;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title)
    {
        super(title);

        JPanel root = new JPanel() ;
        this.setContentPane( root );

        ColorLabel label1 = new ColorLabel("T" , Color.YELLOW) ;
        ColorLabel label2 = new ColorLabel("Z" , Color.BLUE) ;
        ColorLabel label3 = new ColorLabel("Y" , Color.RED) ;
        ColorLabel label4 = new ColorLabel("V" , Color.CYAN) ;

        root.add(label1) ;
        root.add(label2) ;
        root.add(label3) ;
        root.add(label4) ;

        Border border1 = BorderFactory.createLineBorder(Color.BLACK , 4) ;
        label1.setBorder( border1);

        Border border2 = BorderFactory.createMatteBorder(0 , 0, 4, 0 , Color.GREEN ) ;
        label2.setBorder( border2 );

        Border border3 = BorderFactory.createRaisedBevelBorder() ;
        label3.setBorder( border3 );

        Border border4 = BorderFactory.createEtchedBorder(EtchedBorder.RAISED) ;
        label4.setBorder( border4 );

//        Border border5 = BorderFactory.createCompoundBorder(border1 , border2) ;
//        label4.setBorder(border5) ;

    }
}
