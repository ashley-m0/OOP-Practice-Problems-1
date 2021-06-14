package ex37.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 37 - Password Generator
Coming up with a password that meets specific requirements is something your computer can do. And
it will give you practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password. Prompt the user for the minimum length, the number
of special characters, and the number of numbers. Then generate a password for the user using those
inputs.

Example Output:
What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#

Constraints:
Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.

Challenges:
Randomly convert vowels to numbers, such as 3 for E and 4 for A.
Have the program present a few options rather than a single result.
Place the password on the user’s clipboard when generated.
 */

import java.util.Random;
import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {


        //get user input
        System.out.print("What's the minimum length? ");
        int min = input.nextInt();
        System.out.print("How many special characters? ");
        int numSpecial = input.nextInt();
        System.out.print("How many numbers? ");
        int num = input.nextInt();

        char[] password = new char[min+1];
        password = generatePassword(min, numSpecial, num);

        String message = generateMessage(password);
        System.out.print(message);
    }

    public static char[] generatePassword(int min, int numSpecial, int num){
        GeneratePassword myPassword = new GeneratePassword();
        char[] password = new char[min+1];
        int specialCount = 0;
        int numCount = 0;
        int letterCount = 0;
        int randomNum;

        while (specialCount < numSpecial){
            randomNum = rand.nextInt(min + 1);
            if (password[randomNum] == 0){
                password[randomNum] = myPassword.generateRandSpec();
                specialCount++;
            }
        }

        while (numCount < num){
            randomNum = rand.nextInt(min + 1);
            if (password[randomNum] == 0){
                password[randomNum] = myPassword.generateRandNum();
                numCount++;
            }
        }

        for (int i = 0; i < min + 1; i++){
            if (password[i] == 0){
                if (letterCount <= (specialCount + numCount)){
                    password[i] = myPassword.generateRandLet();
                    letterCount++;
                } else {
                    randomNum = rand.nextInt(3);
                    switch (randomNum){
                        case 0:
                            password[i] = myPassword.generateRandLet();
                            break;
                        case 1:
                            password[i] = myPassword.generateRandNum();
                            break;
                        case 2:
                            password[i] = myPassword.generateRandSpec();
                            break;
                    }
                }
            }
        }

        return password;
    }

    public static String generateMessage(char[] pass){
        String message = "Your password is ";
        for(int i = 0; i < pass.length; i++){
            message += (pass[i]);
        }
        return message;
    }
}
