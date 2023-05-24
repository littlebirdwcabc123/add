import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddGUI extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton;

    public AddGUI() {
        super("加法小程序");


        // 创建并设置字体
        Font font = new Font("微软雅黑", Font.PLAIN, 16);
        UIManager.put("Button.font", font);
        UIManager.put("Label.font", font);
        UIManager.put("TextField.font", font);

        // 创建面板和组件
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JLabel num1Label = new JLabel("第一个数：");
        num1Field = new JTextField(10);
        panel1.add(num1Label);
        panel1.add(num1Field);

        JLabel num2Label = new JLabel("第二个数：");
        num2Field = new JTextField(10);
        panel2.add(num2Label);
        panel2.add(num2Field);

        resultField = new JTextField(10);
        resultField.setEditable(false);
        JLabel resultLabel = new JLabel("计算结果：");
        panel3.add(resultLabel);
        panel3.add(resultField);

        addButton = new JButton("计算");
        addButton.addActionListener(this);

        // 添加面板和组件
        setLayout(new GridLayout(4, 1));
        add(panel1);
        add(panel2);
        add(panel3);
        add(addButton);

        // 设置窗口大小、位置和可见性
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = num1 + num2;
        resultField.setText(Double.toString(result));
    }

    public static void main(String[] args) {
        AddGUI addGUI = new AddGUI();
        System.out.println("加法");
    }
}