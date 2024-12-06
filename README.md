该仓库用于提交java测试类、工具类等

1.JFrame和Frame的主要区别在于它们所属的包、关闭窗口的方式、添加组件的方法以及性能表现。‌
‌包的不同‌：
JFrame‌：属于javax.swing包。
Frame‌：属于java.awt包。
‌关闭窗口的方式不同‌：
Frame‌：需要通过添加WindowListener并重写windowClosing方法来使关闭按钮有效。
JFrame‌：可以通过调用setDefaultCloseOperation方法来设置关闭操作，例如DISPOSE_ON_CLOSE，这样当用户关闭窗口时，程序会执行相应的操作，而不是简单地隐藏窗口‌12。
‌添加组件的方法不同‌：
Frame‌：直接使用add方法添加组件。
JFrame‌：可以使用add方法和getContentPane.add()方法添加组件。JFrame覆盖了Container的addImpl方法，因此JFrame的add方法和Frame的add方法行为不同‌13。
‌性能表现不同‌：
JFrame‌：调用repaint方法时不会刷新背景，这可能会导致在重绘时出现闪烁问题。
Frame‌：调用repaint方法时会刷新背景，这有助于减少重绘时的闪烁问题‌
