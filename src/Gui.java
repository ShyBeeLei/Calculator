import javax.swing.*;
import java.awt.*;

/**
 * @ClassName Gui
 * @Description 计算器图形界面
 * @Author Bruce Xu
 * @Date 2021/7/19 20:16
 * @Version 1.0
 */
public class Gui extends JFrame {
    /**
     * 按钮
     */
    static JButton percent = new JButton("%"),
            clearAll = new JButton("CE"),
            clear = new JButton("C"),
            back = new JButton("<   backspace"),
            fractionOf = new JButton("1/x"),
            square = new JButton("x^2"),
            squareRoot = new JButton("√x"),
            divide = new JButton("➗"),
            seven = new JButton("7"),
            eight = new JButton("8"),
            nine = new JButton("9"),
            multiply = new JButton("X"),
            four = new JButton("4"),
            five = new JButton("5"),
            six = new JButton("6"),
            minus = new JButton("-"),
            one = new JButton("1"),
            two = new JButton("2"),
            three = new JButton("3"),
            plus = new JButton("+"),
            negative = new JButton("+/-"),
            zero = new JButton("0"),
            point = new JButton("."),
            equal = new JButton("=");
    /**
     * 创建网格布局
     */
    GridBagLayout gridBagLayout = new GridBagLayout();
    /**
     * 网格布局管理器
     */
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    /**
     * 菜单栏
     */
    JMenuBar menuBar = new JMenuBar();
    /**
     * 菜单
     */
    JMenu open = new JMenu("打开 "), help = new JMenu("帮助");
    /**
     * 菜单元素
     */
    JMenuItem standard = new JMenuItem("标准计算器"), science = new JMenuItem("科学计算器");
    /**
     * 文本框，并设置初始值为0
     */
    JTextField jTextField = new JTextField("0");
    /**
     * 按钮行列数以及按钮数组的下标
     */
    int col = 6, row = 4, index = 0;
    /**
     * 按钮数组
     */
    JButton[] jButtons = {percent, clearAll, clear, back, fractionOf, square, squareRoot, divide, seven, eight, nine, multiply, four, five, six, minus, one, two, three, plus, negative, zero, point, equal};

    public Gui() {

        /*
         设置GUI参数
         */
        super("计算器");
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        setIconImage(Toolkit.getDefaultToolkit().getImage(Gui.class.getResource("Diana.JPG")));
        this.setResizable(false);
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(gridBagLayout);
        this.setJMenuBar(menuBar);


        /*
        设置文本框参数并添加到网格
         */
        jTextField.setEditable(false);
        jTextField.setFont(new Font("宋体", Font.BOLD, 30));
        jTextField.setHorizontalAlignment(JTextField.RIGHT);
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.7;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(jTextField, gridBagConstraints);
        ButtonListener buttonListener = new ButtonListener(jTextField);
        menuBar.add(open);
        menuBar.add(help);
        open.add(standard);
        open.add(science);
        this.add(jTextField);

        /*
        设置按钮布局参数并添加按钮。
         */
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.gridwidth = 1;
        for (int i = 0; i < col; i++) {
            while (index % row < row && index < jButtons.length) {
                gridBagLayout.setConstraints(jButtons[index], gridBagConstraints);
                if (index % row == 2) {
                    gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
                }
                this.add(jButtons[index]);
                jButtons[index].addActionListener(buttonListener);
                if (index % row == 3) {
                    gridBagConstraints.gridwidth = 1;
                }
                index++;
            }
        }
    }

    public static void main(String[] args) {
        new Gui();
    }

}
