/**
 * @ClassName Calculate
 * @Description 进行运算的类
 * @Author Bruce Xu
 * @Date 2021/7/20 20:50
 * @Version 1.0
 */
public class Calculate {
    Calculate(){
    }

    public double calculate(int symbol,double firstNumber,double lastNumber){
        switch (symbol) {
            case 1:
                return firstNumber+lastNumber;
            case 2:
                return firstNumber-lastNumber;
            case 3:
                return firstNumber*lastNumber;
            case 4:
                return firstNumber/lastNumber;
            default:
                return lastNumber;
        }
    }
}
