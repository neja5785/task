package clean;

import java.math.BigDecimal;

public class Parser {
    public static boolean parseExpression(String input) {
        try {
            if (input.equalsIgnoreCase("quit")) {
                return false;
            } else {
                String[] expression = input.split(" ");
                BigDecimal op1 = new BigDecimal(expression[0]);
                char operation = expression[1].charAt(0);
                BigDecimal op2 = new BigDecimal(expression[2]);
                Operations.operations(op1, operation, op2);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vesk is naujo");
        } catch (NumberFormatException e) {
            System.out.println("Blogai ivedei");
            System.out.println("input = " + input);
         }
        return true;
    }
}
