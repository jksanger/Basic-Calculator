package calculator;

import java.util.Scanner;

/**
 *
 * @author 
 * Joseph Sanger 1527317
 * CS 55 (1722)
 * Project 2 Calculator
 */
// This program will take two numbers from the user and perform a mathematical operation designated by the user.

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        char ch; // Char to decide loop
        double num1, num2, result = 0; // Users numbers and result of operation
      
        
        // Do/While Loop start
       do {
       System.out.println("Hi! I am really good at math! Put me to the test.");
       System.out.println("Enter two numbers and an operation");
       System.out.println("Enter first number and press Enter: ");
       
       num1 = scan.nextDouble(); //Scans first number
       
       System.out.println("Enter second number and press Enter: ");
       
       num2 = scan.nextDouble(); //Scans second number
       
       scan.nextLine(); //Scans operator
       System.out.println("Please enter one of the operations +, -, * or / and press Enter: ");
       
       char operator = scan.nextLine().charAt(0);//
       
       //Start of switch
       switch (operator){
       
       //Addition Case
       case '+':
           result = num1 + num2;
           System.out.println(num1 + " + " + num2 + " = " + result);
           System.out.println("I'm great at addition!");
            break;
       
        //Subtraction Case
       case '-':
           result = num1 - num2;
           System.out.println(num1 + " - " + num2 + " = " + result);
           System.out.println("I'm great at subtraction!");
            break;
       
        //Multiplication Case
       case '*':
           result = num1 * num2;
           System.out.println(num1 + " * " + num2 + " = " + result);
           System.out.println("I'm great at multiplication!");
            break;  
       
        //Division Case
       case '/':
           result = num1 / num2;
           System.out.println(num1 + " / " + num2 + " = " + result);
           System.out.println("I'm great at division!");
            break;
       
       //Not Valid Case
       default:
           System.out.println("I can compute really well, but what you entered is not one of the operations I know ...");
         }
           
       System.out.println("Play again [y/n]?: ");
       
       //Scans play again
       ch = scan.nextLine().charAt(0);
    
       }
       //Will loop if selection is 'y'
       while (ch == 'y');
        System.out.println("Bye bye!");
    
}
}