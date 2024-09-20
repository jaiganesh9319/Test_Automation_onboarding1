package logs4j;


//Demonstrate Logging to a File



import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SimpleCalculator1 {
    private static final Logger logger = Logger.getLogger(SimpleCalculator.class.getName());

    public static void main(String[] args) throws Exception {
        // Configure the logger to write to a file
        FileHandler fileHandler = new FileHandler("calculator.log", true);
        fileHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fileHandler);

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
            // The switch case remains the same
        }
    }
}
