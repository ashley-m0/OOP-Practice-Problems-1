package ex22;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 21 - Numbers to Names
Many programs display information to the end user in one form but use a different form inside
the program. For example, you may show the word Blue on the screen, but behind the scenes you’ll
have a numerical value for that color or an internal value because you may need to represent the
textual description in another language for Spanish-speaking visitors.

Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number
and display the corresponding calendar month, with 1 being January and 12 being December. For any
value outside that range, display an appropriate error message.

Example Output:
Please enter the number of the month: 3
The name of the month is March.

Constraints:
Use a switch or case statement for this program.
Use a single output statement for this program.

Challenges:
Use a map or dictionary to remove the switch statement from the program.
Support multiple languages. Prompt for the language at the beginning of the program.
*/

public class App 
{
    static Scanner input = new Scanner(System.in);
    public static void main( String[] args )
    {
        App myApp = new App();
        int num1 = myApp.getNumber("first");
        int num2 = myApp.getNumber("second");
        int num3 = myApp.getNumber("third");
        int diff = myApp.checkDifference(num1, num2, num3);

        if (diff == 1){
            int largest = myApp.findLargest(num1, num2, num3);
            System.out.print("The largest number is " + largest + ".");
        }
    }

    public int getNumber (String numWord){
        System.out.print("Enter the " + numWord + " number: ");
        int num = input.nextInt();
        return num;
    }

    public int checkDifference(int num1, int num2, int num3){
        if (num1 != num2 && num1 != num3 && num2 != num3){
            return 1;
        }else {
            return 0;
        }
    }

    public int findLargest(int num1, int num2, int num3){
        int largest = num1;
        if (largest < num2){
            largest = num2;
        }
        if (largest < num3){
            largest = num3;
        }
        return largest;
    }
}
