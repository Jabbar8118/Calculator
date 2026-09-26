package calculator;

public class Calculator {

    public static void main(String[] args) {
        SmartCalculator sc = new SmartCalculator();
        System.out.println("Sum: " + sc.calculate(10, 5));
        System.out.println("Product: " + sc.calculate(2.5, 4.0));
        System.out.println("Sum Expression Result: " + sc.calculate(3, "+", 5));
        System.out.println("Division Expression Result: " + sc.calculate(30, "/", 5));
        System.out.println("Invalid Test: " + sc.calculate(15, "&", 20));  // Invalid case
    }

}
