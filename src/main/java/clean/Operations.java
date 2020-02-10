package clean;

import java.math.BigDecimal;

public class Operations {
    public static void operations(BigDecimal op1, char operation, BigDecimal op2) {
        switch (operation) {
            case '+':
                System.out.println(add(op1, op2));
                  break;
            case '-':
                System.out.println(subtract(op1, op2));
                break;
            case '*':
                System.out.println(multiply(op1, op2));
            break;
            case '/':
                System.out.println(divide(op1, op2));
                break;
            default:
                System.out.println("Invalid Input try again");
                break;
        }
    }
    public static BigDecimal add(BigDecimal op1, BigDecimal op2){
        return op1.add(op2);
    }
    public static BigDecimal subtract(BigDecimal op1, BigDecimal op2){
        return op1.subtract(op2);
    }
    public static BigDecimal multiply(BigDecimal op1,BigDecimal op2){
        return op1.multiply(op2);
    }
    public static BigDecimal divide(BigDecimal op1, BigDecimal op2){
        return op1.divide(op2);
    }

}
