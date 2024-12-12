package test02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginForm extends JFrame {
    // 组件
    private JLabel usernameLable;
    private JTextField usernameField;
    private JLabel passwordLable;
    private JTextField passwordField;
    private JButton loginButton;
    private JButton registerButton;
    private JLabel versionLabel;

    public loginForm() {
        // 初始化窗口
        setTitle("登录窗口");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // 创建面板并设置布局
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        // 添加用户名标签和输入框
        gbc.gridx = 0;
        gbc.gridy = 0;
        usernameLable = new JLabel("账号");
        jPanel.add(usernameLable, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        usernameField = new JTextField(20);
        jPanel.add(usernameField, gbc);

        // 添加密码标签和输入框
        gbc.gridx = 0;
        gbc.gridy = 1;
        passwordLable = new JLabel("密码");
        jPanel.add(passwordLable, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        passwordField = new JTextField(20);
        jPanel.add(passwordField, gbc);

        // 添加登录按钮
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        loginButton = new JButton("登录");
        loginButton.addActionListener(new LoginButtonListener());
        jPanel.add(loginButton, gbc);

        // 添加注册按钮
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        registerButton = new JButton("注册账号");
        jPanel.add(registerButton, gbc);

        // 添加版本标签
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        versionLabel = new JLabel("版本: 1.0.0");
        jPanel.add(versionLabel, gbc);

        // 添加面板到窗口
        add(jPanel, BorderLayout.CENTER);

        // 设置窗口背景颜色
        getContentPane().setBackground(Color.WHITE);
    }
    // 登录按钮的监听器
    private class LoginButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            char[] password = passwordField.getText().toCharArray();

            // 这里可以添加登录逻辑，例如验证用户名和密码
            if ("exampleUser".equals(username) && "examplePass".equals(new String(password))) {
                JOptionPane.showMessageDialog(loginForm.this, "登录成功");
            } else {
                JOptionPane.showMessageDialog(loginForm.this, "用户名或密码错误！");
            }
        }
    }

    public static void main(String[] args) {
        // 在事件调度线程中创建和显示GUI
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }
}
