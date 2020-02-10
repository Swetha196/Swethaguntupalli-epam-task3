import Methods.*;

public class Compute {
    public static double getValue(double num1,double num2,String op) {
        calcy calc[]= {new Add(), new Sub(), new Mul(), new Div()};
        String oper[] = {"+", "-", "*", "/"};
        try{
            int res = 0;
            for (int i = 0; i < 4; i++) {
                if (op.equals(oper[i])) {
                    res = i;
                    break;
                }
            }
            return calc[res].cal(num1, num2);
        }catch (ArithmeticException e){
            System.out.println("Infinity");
            return 0;
        }
    }
}