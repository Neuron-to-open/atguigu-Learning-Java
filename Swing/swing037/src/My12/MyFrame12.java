package My12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * DATE: 2022/7/13
 * Author: yjy --- BUPT
 */
public class MyFrame12 extends JFrame {

    // 列表框
    JList<String> listbox = new JList<>();
    DefaultListModel<String> model = new DefaultListModel<>();

    public MyFrame12(String title)
    {
        super(title);

        JPanel root = new JPanel();
        root.setLayout(new BorderLayout());
        this.setContentPane(root);

        // 添加列表框
        root.add( new JScrollPane(listbox), BorderLayout.CENTER);

        // 初始化列表框数据
        initListView();


        // 列表框的鼠标事件处理
        listbox.addMouseListener( new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e)
            {
                if (e.getButton() == MouseEvent.BUTTON3)
                {
                    listboxRightClicked( e);
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


    private void listboxRightClicked(MouseEvent e)
    {
        int index = locationToIndex(listbox, e.getPoint());
        System.out.println("右键点中了 index=" + index);

        listbox.clearSelection();
        if (index >= 0) {
            listbox.setSelectedIndex( index );
        }

        // 弹出上下文菜单
        JPopupMenu menu = new JPopupMenu();
        menu.add(new JMenuItem("测试"));
        menu.show(e.getComponent(), e.getX(), e.getY());

    }


    // 更精确的计算，鼠标点击的位置在哪一项
    public static int locationToIndex(JList listbox, Point location)
    {
        int index = listbox.locationToIndex( location);
        if(index < 0) return -1;

        // 进一步确认
        Rectangle bounds = listbox.getCellBounds(index, index);
        if(bounds.contains( location))
            return index;

        return -1;
    }
}
