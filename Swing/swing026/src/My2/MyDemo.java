package My2;

import My3.MyFrame;

import javax.swing.*;

public class MyDemo {
    public static void main(String[] args)
    {
        JFrame frame = new MyFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
