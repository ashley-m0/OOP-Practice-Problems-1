package ex27.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 27 - Validating Inputs
Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a
program into smaller functions that do one thing each. The program can then call these functions in sequence
to perform the work.

Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is
valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Example Output:
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.

Or

Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.

Constraints:
Create a function for each type of validation you need to write. Then create a validateInput function that
takes in all of the input data and invokes the specific validation functions.
Use a single output statement to display the outputs.

Challenges:
Use regular expressions to validate the input.
Implement this as a GUI application or web application that gives immediate feedback when the fields lose focus.
Repeat the process if the input is not valid.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get user input
        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zipCode = input.nextLine();
        System.out.print("Enter the employee ID: ");
        String employeeId = input.nextLine();

        Employee user = new Employee(firstName, lastName, zipCode, employeeId);

        String message = validateInput(user);
        System.out.print(message);

    }

    public static String validateInput(Employee user){
        String message = "";
        int errors = 0;
        if (!user.checkFirstNameLength()){
            errors++;
            message = message.concat("\nThe first name must be at least 2 characters long.");
        }
        if (!user.checkLastNameLength()){
            errors++;
            message = message.concat("\nThe last name must be at least 2 characters long.");
        }
        if (!user.checkFirstNamePresent()){
            errors++;
            message = message.concat("\nThe first name must be filled in.");
        }
        if(!user.checkLastNamePresent()){
            errors++;
            message = message.concat("\nThe last name must be filled in.");
        }
        if (!user.checkEmployeeID()){
            errors++;
            message = message.concat("\nThe employee ID must be in the format of AA-1234.");
        }
        if (!user.checkZip()){
            errors++;
            message = message.concat("\nThe zipcode must be a 5 digit number.");
        }
        if(errors == 0){
            message = message.concat("\nThere were no errors found.");
        }

        return message;
    }
}
