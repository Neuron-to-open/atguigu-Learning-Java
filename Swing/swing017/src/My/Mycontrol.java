package My;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/17 20:58
 * @since JDK17
 */
public class Mycontrol extends JPanel {

    private boolean hover = false ;
    public Mycontrol ()
    {
        this.addMouseListener(new MyMouseListener());
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = this.getWidth() ;
        int height = this.getHeight() ;
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);
        if(hover) {
            g.setColor(Color.BLACK);
            g.drawRect(0,0,width,height);
        }
        else {
            g.setColor(Color.GRAY);
            g.drawRect(0, 0, width , height);
        }
    }


    private class MyMouseListener implements MouseListener
    {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
                System.out.println("** mouseEntered() .....") ;
                hover = true ;
                repaint();
        }

        @Override
        public void mouseExited(MouseEvent e) {
                System.out.println("** mouseExited()....") ;
                hover = false ;
                repaint();

        }
    }
}
