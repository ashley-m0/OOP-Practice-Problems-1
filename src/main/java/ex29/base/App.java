package ex29.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 29 - Handling Bad Input
The rule of 72 is a quick method for estimating how long it will take to double your investment,
by taking the number 72 and dividing it by the expected rate of return. It’s a good tool that helps
you figure out if the stock, bond, or savings account is right for you. It’s also a good program to
write to test for and prevent bad input because computers can’t divide by zero. And instead of
exiting the program when the user enters invalid input, you can just keep prompting for inputs
until you get one that’s valid.

Write a quick calculator that prompts for the rate of return on an investment and calculates how
many years it will take to double your investment.

The formula is:
years = 72 / r
where r is the stated rate of return.

Example Output:
What is the rate of return? 0
Sorry. That's not a valid input.
What is the rate of return? ABC
Sorry. That's not a valid input.
What is the rate of return? 4
It will take 18 years to double your initial investment.

Constraints:
Don’t allow the user to enter 0.
Don’t allow non-numeric values.
Use a loop to trap bad input, so you can ensure that the user enters valid values.

Challenge:
Display a different error message when the user enters 0.
 */

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valid = 0;
        Rate myRate = new Rate();

        while (valid == 0){
            System.out.print("What is the rate of return? ");
            String userInput = input.nextLine();
            myRate.setRate(userInput);
            if (myRate.getRate() == 0 ){
                System.out.print("Sorry. That's not a valid input.\n");
            } else{
                valid = 1;
            }
        }

        int years = calcReturn(myRate.getRate());
        String message = generateMessage(years);
        System.out.print(message);

    }

    public static int calcReturn(int rate){
        double years = 72.0 / rate;

        //round up if needed
        double leftover = years % 1;
        if (leftover != 0.0){
            years += 1.0;
        }
        years -= leftover;

        int total = (int) years;
        return total;
    }

    public static String generateMessage(int years){
        String message = "It will take " + years + " years to double your initial investment.";
        return message;
    }
}
