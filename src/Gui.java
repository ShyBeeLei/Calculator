import javax.swing.*;
import java.awt.*;

/**
 * @ClassName Gui
 * @Description 计算机图形界面
 * @Author Bruce Xu
 * @Date 2021/7/19 20:16
 * @Version 1.0
 */
public class Gui extends JFrame {
    GridBagLayout gridBagLayout = new GridBagLayout();
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    JMenuBar menuBar = new JMenuBar();
    JMenu open = new JMenu("打开 "), help = new JMenu("帮助");
    JMenuItem standard = new JMenuItem("标准计算器"), science = new JMenuItem("科学计算器");
    JTextField jTextField = new JTextField("0");
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


    public Gui() {
        super("计算器");
        this.setResizable(false);
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(gridBagLayout);
        this.setJMenuBar(menuBar);
        jTextField.setEditable(false);
        jTextField.setFont(new Font("宋体", Font.BOLD, 30));
        jTextField.setHorizontalAlignment(JTextField.RIGHT);
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.0;
        gridBagConstraints.weighty = 0.7;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(jTextField, gridBagConstraints);


        menuBar.add(open);
        menuBar.add(help);
        open.add(standard);
        open.add(science);
        this.add(jTextField);

        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.gridwidth = 1;

        gridBagLayout.setConstraints(percent, gridBagConstraints);
        this.add(percent);
        gridBagLayout.setConstraints(clearAll, gridBagConstraints);
        this.add(clearAll);
        gridBagLayout.setConstraints(clear, gridBagConstraints);
        this.add(clear);
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(back, gridBagConstraints);
        this.add(back);
        gridBagConstraints.gridwidth = 1;

        gridBagLayout.setConstraints(fractionOf, gridBagConstraints);
        this.add(fractionOf);
        gridBagLayout.setConstraints(square, gridBagConstraints);
        this.add(square);
        gridBagLayout.setConstraints(squareRoot, gridBagConstraints);
        this.add(squareRoot);
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(divide, gridBagConstraints);
        this.add(divide);
        gridBagConstraints.gridwidth = 1;

        gridBagLayout.setConstraints(seven, gridBagConstraints);
        this.add(seven);
        gridBagLayout.setConstraints(eight, gridBagConstraints);
        this.add(eight);
        gridBagLayout.setConstraints(nine, gridBagConstraints);
        this.add(nine);
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(multiply, gridBagConstraints);
        this.add(multiply);
        gridBagConstraints.gridwidth = 1;


        gridBagLayout.setConstraints(four, gridBagConstraints);
        this.add(four);
        gridBagLayout.setConstraints(five, gridBagConstraints);
        this.add(five);
        gridBagLayout.setConstraints(six, gridBagConstraints);
        this.add(six);
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(minus, gridBagConstraints);
        this.add(minus);
        gridBagConstraints.gridwidth = 1;

        gridBagLayout.setConstraints(one, gridBagConstraints);
        this.add(one);
        gridBagLayout.setConstraints(two, gridBagConstraints);
        this.add(two);
        gridBagLayout.setConstraints(three, gridBagConstraints);
        this.add(three);
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(plus, gridBagConstraints);
        this.add(plus);
        gridBagConstraints.gridwidth = 1;

        gridBagLayout.setConstraints(negative, gridBagConstraints);
        this.add(negative);
        gridBagLayout.setConstraints(zero, gridBagConstraints);
        this.add(zero);
        gridBagLayout.setConstraints(point, gridBagConstraints);
        this.add(point);
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagLayout.setConstraints(equal, gridBagConstraints);
        this.add(equal);
        gridBagConstraints.gridwidth = 1;

        ButtonListener buttonListener = new ButtonListener(jTextField);
        percent.addActionListener(buttonListener);
        clearAll.addActionListener(buttonListener);
        clear.addActionListener(buttonListener);
        back.addActionListener(buttonListener);
        fractionOf.addActionListener(buttonListener);
        square.addActionListener(buttonListener);
        squareRoot.addActionListener(buttonListener);
        divide.addActionListener(buttonListener);
        seven.addActionListener(buttonListener);
        eight.addActionListener(buttonListener);
        nine.addActionListener(buttonListener);
        multiply.addActionListener(buttonListener);
        four.addActionListener(buttonListener);
        five.addActionListener(buttonListener);
        six.addActionListener(buttonListener);
        minus.addActionListener(buttonListener);
        one.addActionListener(buttonListener);
        two.addActionListener(buttonListener);
        three.addActionListener(buttonListener);
        plus.addActionListener(buttonListener);
        negative.addActionListener(buttonListener);
        zero.addActionListener(buttonListener);
        point.addActionListener(buttonListener);
        equal.addActionListener(buttonListener);
    }

    public static void main(String[] args) {
        new Gui();
    }

}
