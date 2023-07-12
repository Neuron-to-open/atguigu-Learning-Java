package My13;

import javax.swing.*;
import java.awt.*;

/**
 * DATE: 2022/7/13
 * Author: yjy --- BUPT
 */
public class MyFrame13 extends JFrame {

    // 列表框
    JList<Student> listbox = new JList<>();
    // 列表框的数据 Model
    DefaultListModel<Student> model = new DefaultListModel<>();


    public MyFrame13 (String title)
    {
        super(title);

        JPanel root = new JPanel();
        root.setLayout(new BorderLayout());
        this.setContentPane(root);

        // 添加列表框
        root.add( new JScrollPane(listbox), BorderLayout.CENTER);

        // 初始化列表框数据
        initListView();

    }

    // 初始化列表数据
    private void initListView()
    {
        model.addElement(new Student(2001, "莫凡", true, "13810012345"));
        model.addElement(new Student(2002, "穆宁雪", false, "13310002233"));
        model.addElement(new Student(2003, "叶心夏", false, "13390991292"));


        listbox.setModel(model); // 显示数据

        listbox.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }

}
