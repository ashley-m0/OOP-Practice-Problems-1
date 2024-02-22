package ex05;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 5 - Simple Math
You’ll often write programs that deal with numbers. And depending on the programming language you use,
you’ll have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those
numbers as shown in the example output:

Example Output:
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints:
-Values coming from users will be strings. Ensure that you convert these values to numbers before doing
 the math.
-Keep the inputs and outputs separate from the numerical conversions and other processing.
-Generate a single output statement with line breaks in the appropriate spots.

Challenges:
-Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed
 if the value entered is not numeric.
-Don’t allow the user to enter a negative number.
 */


import java.util.Objects;
import java.util.Scanner;

public class App
{
    static Scanner input = new Scanner(System.in);
    public static void main( String[] args )
    {
        AutomaticCalculator myAutomaticCalculator = new AutomaticCalculator();

        //get inputs
        while(myAutomaticCalculator.getNum1() == 0) {
            System.out.print("What is the first number? ");
            myAutomaticCalculator.setNum1(input.nextLine());
        }
        while(myAutomaticCalculator.getNum2() == 0) {
            System.out.print("What is the second number? ");
            myAutomaticCalculator.setNum2(input.nextLine());
        }

        //generate output
        System.out.println(myAutomaticCalculator);
    }

}


