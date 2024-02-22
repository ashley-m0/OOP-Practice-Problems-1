package ex19;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 19 - BMI Calculator
You’ll often need to see if one value is within a certain range and alter the flow of a program as a
result.

Create a program to calculate the body mass index (BMI) for a person using the person’s height in
inches and weight in pounds. The program should prompt the user for weight and height.

Calculate the BMI by using the following formula:

bmi = (weight / (height × height)) * 703
If the BMI is between 18.5 and 25, display that the person is at a normal weight. If they are out
of that range, tell them if they are underweight or overweight and tell them to consult their doctor.

Example Output:
Your BMI is 19.5.
You are within the ideal weight range.
or

Your BMI is 32.5.
You are overweight. You should see your doctor.

Constraint:
Ensure your program takes only numeric data. Don’t let the user continue unless the data is valid.

Challenges:
Make the user interface accept height and weight in Imperial or metric units. You’ll need a slightly
different formula for metric units.
For Imperial measurements, prompt for feet and inches and convert feet to inches so the user doesn’t
have to.
Use a GUI interface with sliders for height and weight. Update the user interface on the fly. Use
colors as well as text to indicate health.
 */

public class App 
{
    static Scanner input = new Scanner (System.in);
    public static void main( String[] args )
    {
        App myApp = new App();
        double height = myApp.getHeight();
        double weight = myApp.getWeight();
        double bmi = myApp.calcBMI(height, weight);

        System.out.println(String.format("Your BMI is %.1f.", bmi));
        if (bmi < 18.5){
            System.out.println("You are underweight. You should see your doctor.");
        } else if (bmi > 25){
            System.out.println("You are overweight. You should see your doctor.");
        } else{
            System.out.println("You are within the ideal weight range.");
        }
    }

    public int getHeight(){
        System.out.print("Enter your height in inches: ");
        int height = input.nextInt();
        return height;
    }

    public int getWeight(){
        System.out.print("Enter your weight in pounds: ");
        int weight = input.nextInt();
        return weight;
    }

    public double calcBMI(double height, double weight){
        double bmi = (weight / (height * height)) * 703;
        return bmi;
    }
}
