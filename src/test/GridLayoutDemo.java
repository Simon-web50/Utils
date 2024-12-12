package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame jFrame = new JFrame("计算器");
            jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            // 添加窗口监听器来处理关闭事件
            jFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    // 停止服务的逻辑
                    stopService();
                    // 关闭窗口
                    System.exit(0);
                }
            });
            //1.创建一个Panel对象，里面存放一个TextFiled组件
            Panel p = new Panel();
            p.add(new TextField(30));
            //2.把当前这个Panel添加到frame的北边区域
            jFrame.add(p, BorderLayout.NORTH);
            //3.创建一个Panel对象，并且设置它的布局管理器为GridLayout
            Panel p2 = new Panel();
            p2.setLayout(new GridLayout(3, 5, 4, 4));
            //4.往Panel中添加内容
            for (int i = 0; i < 10; i++) {
                p2.add(new Button(i + ""));
            }
            p2.add(new Button("+"));
            p2.add(new Button("-"));
            p2.add(new Button("*"));
            p2.add(new Button("/"));
            p2.add(new Button("."));

            //5.把当前Panel添加到frame中
            jFrame.add(p2);
            jFrame.pack();
            jFrame.setVisible(true);
        });
    }
    private static void stopService() {
        System.out.println("服务已停止");
    }
}
