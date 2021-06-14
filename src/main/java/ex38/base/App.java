package ex38.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 38 - Filtering Values
Sometimes input you collect will need to be filtered down. Data structures and loops can make
this process easier.

Create a program that prompts for a list of numbers, separated by spaces. Have the program print
out a new list containing only the even numbers.

Example Output:
Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.

Constraints:
Convert the input to an array. Many languages can easily convert strings to arrays with a built-in
function that splits apart a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this. The function takes in the
old array and returns the new array.

Challenge:
Instead of prompting for numbers, read in lines from any text file and print out only the even-numbered lines.
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        App myApp = new App();

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numString = input.nextLine();

        int[] numArray = myApp.stringToIntArray(numString);
        numArray = myApp.filterEvenNumbers(numArray);

        String message = myApp.generateMessage(numArray);
        System.out.print(message);

    }

    public int[] stringToIntArray(String numString){
        String[] charArray = numString.split(" ");
        int[] intArray = new int[(numString.length()/2) + 1];
        for (int i = 0; i < charArray.length; i++){
            intArray[i] = Integer.parseInt(charArray[i]);
        }
        return intArray;
    }

    public int[] filterEvenNumbers(int[] numArray){
        int[] newArray = new int[(numArray.length/2)];
        int index = 0;
        for (int i = 0; i < numArray.length; i++){
            if (numArray[i] % 2 == 0){
                newArray[index] = numArray[i];
                index++;
            }
        }
        return newArray;
    }

    public String generateMessage(int[] nums){
        String message = "The even numbers are ";
        for(int i = 0; i < nums.length; i++){
            message = message + nums[i] + " ";
        }

        return message;
    }
}
