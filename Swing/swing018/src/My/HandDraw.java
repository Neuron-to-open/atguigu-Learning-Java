package My;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List ;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 21:37
 * @since JDK17
 */
public class HandDraw extends JPanel {


    private boolean pressed = false ;
    private List<Point> points = new ArrayList<>() ;

    public HandDraw ()
    {
        MyMouseListener l = new MyMouseListener() ;
        this.addMouseListener(l);
        this.addMouseMotionListener(l);
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = this.getWidth() ;
        int height = this.getHeight() ;
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);


        if(points.size() >= 2)
        {
            g.setColor(Color.RED);
            Point p1 = points.get(0) ;
            for(int i = 1 ; i < points.size() ; i++)
            {
                Point p2 = points.get(i) ;
                g.drawLine(p1.x , p1.y , p2.x , p2.y);
                p1 = p2 ;
            }
        }
    }


    private class MyMouseListener extends MouseAdapter
    {

        @Override
        public void mousePressed(MouseEvent e) {
            pressed = true ;
            points.add( e.getPoint());
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            pressed = false ;
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if(pressed)
            {
                points.add(e.getPoint()) ;
                repaint() ;
            }
        }
    }
}
