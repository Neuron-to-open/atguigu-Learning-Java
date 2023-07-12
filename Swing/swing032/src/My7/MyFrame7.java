package My7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * DATE: 2022/7/12
 * Author: yjy --- BUPT
 */
public class MyFrame7 extends  JFrame{
    HandDraw7 canvas = new HandDraw7();

    ContextMenuListener menuListener = new ContextMenuListener();

    public MyFrame7(String title)
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
        item1.addActionListener(menuListener);
        item1.setActionCommand("save as");
        menu.add(item1);

        JMenuItem item2 = new JMenuItem("清空");
        item2.addActionListener(menuListener);
        item2.setActionCommand("clear");
        menu.add(item2);

        menu.show ( e.getComponent(), e.getX(), e.getY());
    }


    //
    private class ContextMenuListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            // 从事件中取出命令码
            String cmd = e.getActionCommand();

            // 不同的菜单项，对应不同的命令码
            if(cmd.equals("save as"))
            {
                System.out.println("menu: save as ..");
            }
            if(cmd.equals("clear"))
            {
                System.out.println("menu: clear ..");
            }
        }

    }
}
