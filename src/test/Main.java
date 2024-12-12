package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // 创建一个窗口
            JFrame jFrame = new JFrame("这里是一个Window测试窗口");
            jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            // 初始化窗口
            // 指定窗口的位置、大小(单位像素px)
            jFrame.setLocation(100, 100);
            jFrame.setSize(500, 300);
            // frame.setBounds(100, 100, 500, 300);

            // 创建一个panel
            Panel p = new Panel();

            // 创建一个文本框和一个按钮,并且把他们放入panel容器中
            p.add(new TextField("这是一个测试文本"));
            p.add(new Button("测试按钮"));

            // 把panel放入到window中
            jFrame.add(p);
            jFrame.setVisible(true);
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
        });
    }
    private static void stopService() {
        System.out.println("服务已停止");
    }
}
