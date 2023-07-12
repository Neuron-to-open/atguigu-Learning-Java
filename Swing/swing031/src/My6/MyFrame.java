package My6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * DATE: 2022/7/12
 * Author: yjy --- BUPT
 */
public class MyFrame extends JFrame {
    HandDraw canvas = new HandDraw();

    public MyFrame(String title)
    {
        super("涂鸦");

        JPanel root = new JPanel();
        this.setContentPane(root);
        root.setLayout( new BorderLayout());

        // 涂鸦面板
        root.add( canvas, BorderLayout.CENTER);

        //
        canvas.addMouseListener( new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e)
            {
                if( e.getButton() == MouseEvent.BUTTON3)
                {
                    showMenu( e );
                }
            }

        });

    }

    private void showMenu(MouseEvent e)
    {
        JPopupMenu menu = new JPopupMenu ();

        JMenuItem item1 = new JMenuItem("另存为");
        menu.add(item1);

        JMenuItem item2 = new JMenuItem("清空");
        menu.add(item2);

        menu.show ( e.getComponent(), e.getX(), e.getY());
    }

}
