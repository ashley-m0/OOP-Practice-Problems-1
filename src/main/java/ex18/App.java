package ex18;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 18 - Temperature Converter
You’ll often need to determine which part of a program is run based on user input or other events.

Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit.
Prompt for the starting temperature. The program should prompt for the type of conversion and then
perform the conversion.

The formulas are:
C = (F − 32) × 5 / 9 and F = (C × 9 / 5) + 32

Example Output:
Press C to convert from Fahrenheit to Celsius.
Press F to convert from Celsius to Fahrenheit.
Your choice: C
Please enter the temperature in Fahrenheit: 32
The temperature in Celsius is 0.

Constraints:
Ensure that you allow upper or lowercase values for C and F.
Use as few output statements as possible and avoid repeating output strings.

Challenges:
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed
if the value entered is not numeric.
Break the program into functions that perform the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.
Modify the program so it also supports the Kelvin scale.
 */

public class App 
{
    static Scanner input = new Scanner (System.in);
    public static void main( String[] args )
    {
        App myApp = new App();
        String choice = myApp.getConversion();

        if (choice.equals("C") || choice.equals("c")){
            int fahrenheit = myApp.calcFarToCen();
            System.out.print("The temperature in Fahrenheit is " + fahrenheit + ".");
        } else if (choice.equals("F") || choice.equals("f")){
            int celsius = myApp.calcCentoFar();
            System.out.print("The temperature in Celsius is " + celsius + ".");
        }else{
            System.out.print("Invalid choice.");
        }
    }

    public String getConversion(){
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n" +
                "Your choice: ");
        String conversion = input.nextLine();
        return conversion;
    }

    public int calcFarToCen(){
        System.out.print("Please enter the temperature in Fahrenheit: ");
        int temp = input.nextInt();
        int celsius = (temp - 32) * 5 / 9;
        return celsius;
    }

    public int calcCentoFar(){
        System.out.print("Please enter the temperature in Celsius: ");
        int temp = input.nextInt();
        int fahrenheit = (temp * 9 / 5) + 32;
        return fahrenheit;
    }

}
