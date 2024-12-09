import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // 创建一个窗口
            JFrame jFrame = new JFrame("这里测试FlowLayout");
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
            // 初始化窗口
            // 1.通过setLayout方法设置容器的布局管理器
            // frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
            // frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));

            jFrame.setLayout(new FlowLayout(FlowLayout.RIGHT, 40, 20));

            // 2.添加多个按钮到frame中
            for (int i = 1; i <= 200; i++) {
                jFrame.add(new Button("按钮" + i));
            }
            // 3.设置最佳大小,pack方法
            jFrame.pack();
            jFrame.setVisible(true);
            jFrame.getDefaultCloseOperation();
        });
    }
    private static void stopService() {
        System.out.println("服务已停止");
    }

}
