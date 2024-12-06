import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // 创建一个窗口
        JFrame frame = new JFrame("这里是一个Window测试窗口");

        // 指定窗口的位置、大小(单位像素px)
        frame.setLocation(100, 100);
        frame.setSize(500, 300);
        // frame.setBounds(100, 100, 500, 300);

        // 创建一个panel
        Panel p = new Panel();

        // 创建一个文本框和一个按钮,并且把他们放入panel容器中
        p.add(new TextField("这是一个测试文本"));
        p.add(new Button("测试按钮"));

        // 把panel放入到window中
        frame.add(p);

        // 设置窗口对象可见
        frame.setVisible(true);

        // 关闭窗口
        frame.getDefaultCloseOperation();
    }
}
