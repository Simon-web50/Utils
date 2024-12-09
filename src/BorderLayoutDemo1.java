import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutDemo1 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame jFrame = new JFrame("这里测试BorderLayout");

            // 1.给frame设置BorderLayout布局管理器
            jFrame.setLayout(new BorderLayout(30, 10));

            // 2.像JFrame指定区域添加组件
            // 如果不往某个区域放入组件，那么该区域就不会空白出来，而是会被其他区域占用
            jFrame.add(new Button("北侧按钮"), BorderLayout.NORTH);
            jFrame.add(new Button("南侧按钮"), BorderLayout.SOUTH);
            jFrame.add(new Button("东侧按钮"), BorderLayout.EAST);
            jFrame.add(new Button("西侧按钮"), BorderLayout.WEST);
            jFrame.add(new Button("中间按钮"), BorderLayout.CENTER);

            jFrame.pack();
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
