package My;

/**
 * @author jyj @bupt.edu.cn
 * @version 2022/6/18 2:00
 * @since JDK17
 */

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MyFrame extends JFrame {
    JButton saveButton = new JButton("保存");
    HandDraw canvas = new HandDraw();

    public MyFrame(String title) {
        super("涂鸦");

        JPanel root = new JPanel();
        this.setContentPane(root);
        root.setLayout(new BorderLayout());

        // 工具栏
        JPanel topPanel = new JPanel();
        root.add(topPanel, BorderLayout.NORTH);

        // 涂鸦面板
        root.add(canvas, BorderLayout.CENTER);

        // 保存按钮
        topPanel.add(saveButton);

        saveButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                doSave();
            }
        });

    }

    private void doSave() {
        // File file = new File("123.jpg");
        // Util.snapshot( canvas, file);

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("图片文件", "jpg");
        chooser.setFileFilter(filter);

        // 显示对话框
        int ret = chooser.showSaveDialog(this);
        if (ret == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();

            Util.snapshot(canvas, file);
        }

    }
}