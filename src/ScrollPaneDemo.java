import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这里演示ScrollPane");

        // 创建一个ScrollPane对象
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);

        // 往ScrollPane中添加内容
        sp.add(new TextField("这是一个文本")); //不会显示，因为布局方式
        sp.add(new Button("这是测试按钮"));

        // 把ScrollPane添加到Frame中
        frame.add(sp);

        frame.setVisible(true);
    }
}
