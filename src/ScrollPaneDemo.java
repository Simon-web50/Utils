import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Frame frame = new Frame("这里演示ScrollPane");
            JFrame jframe = new JFrame("这里演示ScrollPane");
            jframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            // 初始化窗口
            // 创建一个ScrollPane对象
            ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);

            // 往ScrollPane中添加内容
            sp.add(new TextField("这是一个文本")); //不会显示，因为布局方式
            sp.add(new Button("这是测试按钮"));

            // 把ScrollPane添加到Frame中
            jframe.add(sp);
            jframe.setBounds(100,100,500,300);
            jframe.setVisible(true);
            // 添加窗口监听器来处理关闭事件
            jframe.addWindowListener(new WindowAdapter() {
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
