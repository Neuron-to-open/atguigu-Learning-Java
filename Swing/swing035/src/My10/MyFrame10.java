package My10;

import javax.swing.*;
import java.awt.*;

/**
 * DATE: 2022/7/13
 * Author: yjy --- BUPT
 */
public class MyFrame10 extends JFrame {

    // 列表框
    JList<String> listbox = new JList<>();
    DefaultListModel<String> model = new DefaultListModel<>();

    public MyFrame10(String title)
    {
        super(title);

        JPanel root = new JPanel();
        root.setLayout(new BorderLayout());
        this.setContentPane(root);

        // 添加列表框
        root.add( new JScrollPane(listbox), BorderLayout.CENTER);

        // 初始化列表框数据
        initListView();

        ///////////////////////////////////
        // 顶部，添加一些操作按钮
        if( true ) {
            JButton addButton = new JButton("添加");
            JButton delButton = new JButton("删除");

            JPanel panel = new JPanel();
            panel.add( addButton );
            panel.add( delButton );
            root.add( panel, BorderLayout.NORTH);

            addButton.addActionListener((e)->{
                onAdd();
            });

            delButton.addActionListener((e)->{
                onDelete();
            });
        }

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

    //
    private void onAdd()
    {
        model.addElement("邵发");
        // model.set(0, "罗亚 阿卡特");

    }

    private void onDelete()
    {
        // 获取所有选中的项的索引
        int[] indexArray = listbox.getSelectedIndices();

        // 从后往前、依次删除
        for (int i=indexArray.length-1;  i>=0 ; i--)
        {
            int index = indexArray[i];
            model.remove( index );
        }
    }
}
