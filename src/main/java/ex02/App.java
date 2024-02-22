package ex02;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 2 - Counting the Number of Characters
Create a program that prompts for an input string and displays output that shows the input string
and the number of characters the string contains.

Example Output:
What is the input string? Homer
Homer has 5 characters.

Constraints:
Be sure the output contains the original string.
Use a single output statement to construct the output.
Use a built-in function of the programming language to determine the length of the string.
 */

import java.util.Scanner;

public class App
{
    static Scanner INPUT = new Scanner(System.in);
    public static void main( String[] args )
    {
        CharacterCounter myCharacterCount = new CharacterCounter();

        //Get user input
        System.out.println( "What is the input string?" );
        myCharacterCount.setCharacterString(INPUT.nextLine());

        //Print output
        System.out.println(myCharacterCount);
    }
}

