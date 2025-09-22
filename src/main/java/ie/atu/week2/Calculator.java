package ie.atu.week2;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Calculator {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered: " + firstNum);

        System.out.println("Please enter a second number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered: " + secondNum);

        System.out.println("Please select an operation (add, subtract, multiply, divide): ");
        String operation = scan1.next();

        boolean validOperation = true;
        double result = switch (operation) {
            //Add Num1 + Num2
            case "add" -> firstNum + secondNum;

            default -> {
                System.out.println("Invalid Operation");
                validOperation = false;
                yield 0;
            }
        };

        if (validOperation) {
            System.out.println("The result is: " + result);
        }
        else {
            System.out.println("Operation cancelled due to previous error");
        }
        scan1.close();
    }
}