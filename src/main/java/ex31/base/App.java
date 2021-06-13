package ex31.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 31 - Karvonen Heart Rate
When you loop, you can control how much you increment the counter; you don’t always have to increment
by one.

When getting into a fitness program, you may want to figure out your target heart rate so you don’t
overexert yourself. The Karvonen heart rate formula is one method you can use to determine your rate.
Create a program that prompts for your age and your resting heart rate. Use the Karvonen formula to
determine the target heart rate based on a range of intensities from 55% to 95%. Generate a table
with the results as shown in the example output.
The formula is:
TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

Example Output:
Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm

Constraints:
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without
entering valid inputs.
Display the results in a tabular format.

Challenge:
Implement this as a GUI program that allows the user to use a slider control for the intensity, and
update the interface in real time as the slider moves.
 */

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KarvonenCalculator user = new KarvonenCalculator();
        int validChecker1 = 0;
        int validChecker2 = 0;


        while (validChecker1 == 0){
            System.out.print("Enter you age: ");
            String age = input.nextLine();
            user.setAge(age);
            if (user.getAge() == 0 ){
                System.out.print("Sorry. That's not a valid input.\n");
            } else{
                validChecker1 = 1;
            }
        }

        while (validChecker2 == 0){
            System.out.print("Enter your resting pulse: ");
            String restingHR = input.nextLine();
            user.setRestingHR(restingHR);
            if (user.getRestingHR() == 0 ){
                System.out.print("Sorry. That's not a valid input.\n");
            } else{
                validChecker2 = 1;
            }
        }

        generateTable(user);

    }

    public static void generateTable(KarvonenCalculator user){
        System.out.printf("Resting Pulse: %d\tAge: %d\n", user.getRestingHR(), user.getAge());
        System.out.println("Intensity\t\t| Rate");
        System.out.println("----------------|------------");
        for (int i = 55; i <= 95; i+=5){
            int hr = user.getTargetHeartRate(i);
            System.out.println(i + "%\t\t\t\t| " + hr + " bpm");
        }
    }
}
