package ie.atu.week2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);

        //Prompt the user for a number
        System.out.println("Please enter a number: ");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered: " + firstNum);

        //Prompt the user for a second number
        System.out.println("Please enter a second number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered: " + secondNum);

        //Prompt the user for an operation
        System.out.println("Please select an operation (add, subtract, multiply, divide): ");
        String operation = scan1.next();

        //Boolean ensures that result only prints when the operation is successful
        boolean validOperation = true;
        double result = switch (operation) {
            //Add Num1 to Num2
            case "add" -> firstNum + secondNum;
            //Subtract Num2 from Num1
            case "subtract" -> firstNum - secondNum;
            //Multiply Num1 by Num2
            case "multiply" -> firstNum * secondNum;
            //Divide Num1 by Num2
            case "divide" -> {
                //If else to prevent division by zero
                if(secondNum == 0){
                    System.out.println("Error: Cannot divide by zero");
                    validOperation = false;
                    yield 0;
                }
                else
                {
                    yield firstNum / secondNum;
                }
            }
            //Error message for incorrect operation choice
            default -> {
                System.out.println("Invalid Operation");
                validOperation = false;
                yield 0;
            }
        };
        //Boolean prints result only when operation is resolved successfully
        if (validOperation) {
            System.out.println("The result is: " + result);
        }
        else {
            System.out.println("Operation cancelled due to previous error");
        }
        scan1.close();
    }
}