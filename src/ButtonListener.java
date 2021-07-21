import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName ButtonListener
 * @Description 按钮监听器
 * @Author Bruce Xu
 * @Date 2021/7/19 22:36
 * @Version 1.0
 */
public class ButtonListener implements ActionListener {
    /**
     * 运算符标记
     */
    static int symbol = 0;
    /**
     * 文本框内容是否为初始状态
     */
    static boolean flag = true;
    /**
     * 运算是否结束
     */
    static boolean end = false;
    /**
     * 字符0常量
     */
    final String ZERO = "0";
    /**
     * 保存文本框信息
     */
    JTextField jTextField;
    /**
     * 计算对象
     */
    Calculate calculate = new Calculate();
    /**
     * 计算结果
     */
    double number = 0;

    /**
     * @param jTextField 传入文本框信息。
     */
    ButtonListener(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
        获取按钮信息
         */
        JButton jButton = (JButton) e.getSource();


        /*
        运算符判断以及操作
         */
        if (jButton.equals(Gui.plus)) {
            if (symbol != 0) {
                number = calculate.calculate(symbol, number, Double.parseDouble(jTextField.getText()));
                jTextField.setText(String.valueOf(number));
            }
            number = Double.parseDouble(jTextField.getText());
            symbol = 1;
            flag = true;
        }
        if (jButton.equals(Gui.minus)) {
            if (symbol != 0) {
                number = calculate.calculate(symbol, number, Double.parseDouble(jTextField.getText()));
                jTextField.setText(String.valueOf(number));
            }
            number = Double.parseDouble(jTextField.getText());
            symbol = 2;
            flag = true;
        }
        if (jButton.equals(Gui.multiply)) {
            if (symbol != 0) {
                number = calculate.calculate(symbol, number, Double.parseDouble(jTextField.getText()));
                jTextField.setText(String.valueOf(number));
            }
            number = Double.parseDouble(jTextField.getText());
            symbol = 3;
            flag = true;
        }
        if (jButton.equals(Gui.divide)) {
            if (symbol != 0) {
                number = calculate.calculate(symbol, number, Double.parseDouble(jTextField.getText()));
                jTextField.setText(String.valueOf(number));
            }
            number = Double.parseDouble(jTextField.getText());
            symbol = 4;
            flag = true;
        }
        if (jButton.equals(Gui.equal)) {
            jTextField.setText(String.valueOf(calculate.calculate(symbol, number, Double.parseDouble(jTextField.getText()))));
            end = true;
            symbol = 0;
        }


        /*
        数字按钮判断以操作
         */
        if (jButton.equals(Gui.zero)) {
            if (flag || end) {
                jTextField.setText(ZERO);
                flag = false;
                end = false;
            } else {
                if (ZERO.equals(jTextField.getText())) {
                    jTextField.setText(ZERO);
                } else {
                    jTextField.setText(jTextField.getText() + ZERO);
                }
            }
        }
        if (jButton.equals(Gui.one)) {
            if (flag || end) {
                jTextField.setText("1");
                flag = false;
                end = false;
            } else {
                if (ZERO.equals(jTextField.getText())) {
                    jTextField.setText("1");
                } else {
                    jTextField.setText(jTextField.getText() + "1");
                }
            }
        }
        if (jButton.equals(Gui.two)) {
            if (flag || end) {
                jTextField.setText("2");
                flag = false;
                end = false;
            } else {
                if (ZERO.equals(jTextField.getText())) {
                    jTextField.setText("2");
                } else {
                    jTextField.setText(jTextField.getText() + "2");
                }
            }
        }
        if (jButton.equals(Gui.three)) {
            if (flag || end) {
                jTextField.setText("3");
                flag = false;
                end = false;
            } else {
                if (ZERO.equals(jTextField.getText())) {
                    jTextField.setText("3");
                } else {
                    jTextField.setText(jTextField.getText() + "3");
                }
            }
        }
        if (jButton.equals(Gui.four)) {
            if (flag || end) {
                jTextField.setText("4");
                flag = false;
                end = false;
            } else {
                if (ZERO.equals(jTextField.getText())) {
                    jTextField.setText("4");
                } else {
                    jTextField.setText(jTextField.getText() + "4");
                }
            }
        }
        if (jButton.equals(Gui.five)) {
            if (flag || end) {
                jTextField.setText("5");
                flag = false;
                end = false;
            } else {
                if (ZERO.equals(jTextField.getText())) {
                    jTextField.setText("5");
                } else {
                    jTextField.setText(jTextField.getText() + "5");
                }
            }
        }
        if (jButton.equals(Gui.six)) {
            if (flag || end) {
                jTextField.setText("6");
                flag = false;
                end = false;
            } else {
                if (ZERO.equals(jTextField.getText())) {
                    jTextField.setText("6");
                } else {
                    jTextField.setText(jTextField.getText() + "6");
                }
            }
        }
        if (jButton.equals(Gui.seven)) {
            if (flag || end) {
                jTextField.setText("7");
                flag = false;
                end = false;
            } else {
                if (ZERO.equals(jTextField.getText())) {
                    jTextField.setText("7");
                } else {
                    jTextField.setText(jTextField.getText() + "7");
                }
            }
        }
        if (jButton.equals(Gui.eight)) {
            if (flag || end) {
                jTextField.setText("8");
                flag = false;
                end = false;
            } else {
                if (ZERO.equals(jTextField.getText())) {
                    jTextField.setText("8");
                } else {
                    jTextField.setText(jTextField.getText() + "8");
                }
            }
        }
        if (jButton.equals(Gui.nine)) {
            if (flag || end) {
                jTextField.setText("9");
                flag = false;
                end = false;
            } else {
                if (ZERO.equals(jTextField.getText())) {
                    jTextField.setText("9");
                } else {
                    jTextField.setText(jTextField.getText() + "9");
                }

            }
        }


        /*
        符号的判断及处理
         */
        if (jButton.equals(Gui.percent)) {
            jTextField.setText(String.valueOf(Double.parseDouble(jTextField.getText()) / 100));
        }
        if (jButton.equals(Gui.clearAll)) {
            symbol = 0;
            flag = false;
            jTextField.setText("0");
        }
        if (jButton.equals(Gui.clear)) {
            jTextField.setText("0");
        }
        if (jButton.equals(Gui.back)) {
            if (end) {
                return;
            } else {
                if (jTextField.getText().length() == 1) {
                    jTextField.setText("0");
                } else {
                    jTextField.setText(jTextField.getText().substring(0, jTextField.getText().length() - 1));
                }
            }
        }
        if (jButton.equals(Gui.fractionOf)) {
            jTextField.setText(String.valueOf(1 / Double.parseDouble(jTextField.getText())));
        }
        if (jButton.equals(Gui.square)) {
            jTextField.setText(String.valueOf(Math.pow(Double.parseDouble(jTextField.getText()), 2)));
        }
        if (jButton.equals(Gui.squareRoot)) {
            jTextField.setText(String.valueOf(Math.sqrt(Double.parseDouble(jTextField.getText()))));
        }
        if (jButton.equals(Gui.negative)) {
            jTextField.setText(String.valueOf(-(Double.parseDouble(jTextField.getText()))));
        }
        if (jButton.equals(Gui.point)) {
            char[] chars = jTextField.getText().toCharArray();
            for (char a : chars) {
                if (a == '.') {
                    return;
                }
            }
            jTextField.setText(jTextField.getText() + '.');
        }
    }
}
