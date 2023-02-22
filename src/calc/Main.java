package calc;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        System.out.println("Result of addition: " + calculator.add(a, b));
        System.out.println("Result of subtraction: " + calculator.subtract(a, b));
        System.out.println("Result of multiplication: " + calculator.multiply(a, b));
        
        try {
            System.out.println("Result of division: " + calculator.divide(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
