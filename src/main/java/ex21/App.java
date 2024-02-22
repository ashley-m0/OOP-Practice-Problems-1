package ex21;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 21 - Numbers to Names
Many programs display information to the end user in one form but use a different form inside the program. For example, you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value for that color or an internal value because you may need to represent the textual description in another language for Spanish-speaking visitors.

Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December. For any value outside that range, display an appropriate error message.

Example Output
Please enter the number of the month: 3
The name of the month is March.
Constraints
Use a switch or case statement for this program.
Use a single output statement for this program.
Challenges
Use a map or dictionary to remove the switch statement from the program.
Support multiple languages. Prompt for the language at the beginning of the program.
 */

public class App 
{
    static Scanner input = new Scanner(System.in);
    public static void main( String[] args )
    {
        App myApp = new App();
        int month = myApp.getMonth();
        String message = "The name of the month is ";

        switch(month){
            case 1:
                message = message.concat("January.");
                break;
            case 2:
                message = message.concat("February.");
                break;
            case 3:
                message = message.concat("March.");
                break;
            case 4:
                message = message.concat("April.");
                break;
            case 5:
                message = message.concat("May.");
                break;
            case 6:
                message = message.concat("June.");
                break;
            case 7:
                message = message.concat("July.");
                break;
            case 8:
                message = message.concat("August.");
                break;
            case 9:
                message = message.concat("September.");
                break;
            case 10:
                message = message.concat("October.");
                break;
            case 11:
                message = message.concat("November.");
                break;
            case 12:
                message = message.concat("December.");
                break;
        }

        System.out.print(message);

    }
    public int getMonth(){
        System.out.print("Please enter the number of the month: ");
        int month = input.nextInt();
        return month;
    }
}
