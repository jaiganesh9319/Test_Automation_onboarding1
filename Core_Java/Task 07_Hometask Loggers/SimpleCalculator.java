package logs4j;

import java.util.Scanner;
import java.util.logging.Logger;

public class SimpleCalculator {
    private static final Logger logger = Logger.getLogger(SimpleCalculator.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        logger.info("First number entered: " + num1);

        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        logger.info("Second number entered: " + num2);

        // Input operation
        System.out.print("Enter the operation (+, -, *, /, %, p for percentage): ");
        char operation = scanner.next().charAt(0);
        logger.info("Operation entered: " + operation);

        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                logger.info("Addition result: " + result);
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                logger.info("Subtraction result: " + result);
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                logger.info("Multiplication result: " + result);
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    logger.info("Division result: " + result);
                    System.out.println("Result: " + result);
                } else {
                    logger.severe("Error: Division by zero attempted.");
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    logger.info("Modulus result: " + result);
                    System.out.println("Result: " + result);
                } else {
                    logger.severe("Error: Division by zero attempted.");
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 'p':
            case 'P':
                result = (num1 / num2) * 100;
                logger.info("Percentage result: " + result + "%");
                System.out.println("Result: " + result + "%");
                break;
            default:
                logger.warning("Error: Invalid operation entered.");
                System.out.println("Error: Invalid operation.");
                break;
        }
    }
}

//Demonstrate Levels of Logging
//info: For general informational messages
//warning: For warning messages
//severe: For severe error conditions
