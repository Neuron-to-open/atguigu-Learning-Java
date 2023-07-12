package My11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * DATE: 2022/7/13
 * Author: yjy --- BUPT
 */
public class MyFrame11 extends JFrame {
    JList<String> listbox = new JList<>();
    DefaultListModel<String> model = new DefaultListModel<>();

    public MyFrame11(String title)
    {
        super(title);

        JPanel root = new JPanel();
        root.setLayout(new BorderLayout());
        this.setContentPane(root);

        // 添加列表框
        root.add( new JScrollPane(listbox), BorderLayout.CENTER);

        // 初始化列表框数据
        initListView();

        // 删除原有的鼠标监听器
        if(true) {
            MouseListener[] aaa = listbox.getMouseListeners();
            for(MouseListener a : aaa)
                listbox.removeMouseListener( a );

            MouseMotionListener[] bbb = listbox.getMouseMotionListeners();
            for(MouseMotionListener b : bbb)
                listbox.removeMouseMotionListener( b );
        }

        // 列表框的鼠标事件处理
        listbox.addMouseListener( new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if (e.getButton() == MouseEvent.BUTTON1)
                {
                    listboxClicked( e );
                }
            }

        });

    }

    // 初始化列表数据
    private void initListView()
    {
        model.addElement("罗亚");
        model.addElement("爱丽莎");
        model.addElement("诺艾尔");
        model.addElement("夏洛特");
        model.addElement("莉莉安");
        model.addElement("威廉敏娜");
        model.addElement("保罗");
        model.addElement("卡帝亚");
        model.addElement("约翰");
        model.addElement("雷顿");
        model.addElement("安东尼奥");
        model.addElement("艾丝翠德");
        model.addElement("卡洛琳");
        model.addElement("母神");
        model.addElement("救世主");
        model.addElement("希雅");

        listbox.setModel(model); // 显示数据

        listbox.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }


    private void listboxClicked(MouseEvent e)
    {
        int index = listbox.locationToIndex( e.getPoint());
        System.out.println("左键，点中了 " + index);

        if(index < 0) {
            // 没有选中任何项
        }

        // 进一步的确认。
//		Rectangle bounds = listbox.getCellBounds(index, index);
//		if( ! bounds.contains(e.getPoint()))
//		{
//			// 点中了空白位置
//			listbox.clearSelection();
//			return;
//		}

        // 单选 的实现
//		if(true)
//		{
//			listbox.clearSelection();
//			listbox.setSelectedIndex( index );
//		}

        // 多选的实现
        if(true) {

            if ( listbox.isSelectedIndex( index ))
            {
                listbox.removeSelectionInterval(index,index);
            }
            else
            {
                listbox.addSelectionInterval(index, index);
            }

        }


    }

}
