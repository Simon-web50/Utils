import javafx.scene.paint.Stop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutDemo2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame jFrame = new JFrame("这里测试BorderLayout");

            //1.给frame设置BorderLayout布局管理器
            jFrame.setLayout(new BorderLayout(30, 10));

            //2.往frame的指定区域添加组件
            jFrame.add(new Button("北侧按钮"), BorderLayout.NORTH);
            jFrame.add(new Button("南侧按钮"),BorderLayout.SOUTH);
            jFrame.add(new Button("中间按钮"),BorderLayout.CENTER);

            //jFrame.add(new TextField("测试文本框"));//默认是中间区域，替代原来的

            //这样就可以都显示出来，嵌套了FlowLayout
            Panel p = new Panel();
            p.add(new Button("中间按钮"));

            p.add(new TextField("测试文本框"));

            jFrame.add(p);

            jFrame.pack();
            jFrame.setVisible(true);
            jFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    stopService();
                    System.exit(0);
                }
            });
        });
    }
    private static void stopService() {
        System.out.println("服务已停止");
    }
}
