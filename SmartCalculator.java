
package calculator;

public class SmartCalculator {
    
    int calculate(int a, int b) {      
        return a + b;
    }

    
    double calculate(double a, double b) {    
        return a * b;
    }

   
    double calculate(int num1, String operator, int num2) {       // Solve simple expression like "15 + 20"
        try {
             switch (operator) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    return num1 / num2;
                default:
                    throw new Exception("Invalid operator");
            }

        } catch (Exception e) {
            System.out.println("Invalid expression!");
            return 0;
        }
    }
}
