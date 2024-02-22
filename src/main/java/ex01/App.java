package ex01;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 1 - Saying Hello

Create a program that prompts for your name and prints a greeting using your name.

Example Output:
What is your name? Brian
Hello, Brian, nice to meet you!

Constraint:
Keep the input, string concatenation, and output separate.
 */

import java.util.Scanner;

public class App
{
    static Scanner INPUT = new Scanner(System.in);
    public static void main( String[] args )
    {
        Greeting myGreeting = new Greeting();

        //Get user input
        System.out.println( "What is your name?" );
        myGreeting.setName(INPUT.nextLine());

        //Print output
        System.out.println(myGreeting);
    }

}