package ex03;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 3 - Printing Quotes:

Quotation marks are often used to denote the start and end of a string. But sometimes we need to print
out the quotation marks themselves by using escape characters.

Create a program that prompts for a quote and an author. Display the quotation and author as shown in
the example output.

Example Output:
What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."

Constraints:
-Use a single output statement to produce this output, using appropriate string-escaping techniques
 for quotes.
-If your language supports string interpolation or string substitution, don’t use it for this exercise.
 Use string concatenation instead.
 */

import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);

    public static void main(String[]args) {
        Quote myQuote = new Quote();

        //Get user input
        System.out.println("What is the quote?");
        myQuote.setQuote(input.nextLine());
        System.out.println("Who said it?");
        myQuote.setSpeaker(input.nextLine());

        //Print output
        System.out.println(myQuote);
    }
}

