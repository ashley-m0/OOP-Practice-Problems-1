package ex25.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.

Example Output:
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

Constraints:
Create a passwordValidator function that takes in the password as its argument and returns a value you can
evaluate to determine the password strength. Do not have the function return a string—you may need to support
multiple languages in the future.
Use a single output statement.

Challenge:
Create a GUI application or web application that displays graphical feedback as well as text feedback in real time. As someone enters a password, determine its strength and display the result
 */

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pass = input.nextLine();
        Password user = new Password(pass);
        int strength = passwordValidator(user);
        String message = generateMessage(user, strength);
        System.out.print(message);

    }

    public static int passwordValidator(Password word){
        int length = word.getLength();
        int nums = word.getDigits();
        int chars = word.getCharacters();
        int special = word.getSpecial();
        int strength = 0;

        if (length >= 8 && nums > 1 && chars > 1 && special > 0){
            strength = 4;
        } else if (length >= 8 && nums >= 1 && chars > 1 && special == 0){
            strength = 3;
        } else if (length < 8 && nums == 0 && chars != 0 && special == 0){
            strength = 2;
        } else if (length < 8 && nums != 0 && chars == 0 && special == 0){
            strength = 1;
        }

        return strength;
    }

    public static String generateMessage(Password word, int strength){
        String message = "The password '" + word.getPassword() + "' is a ";

        switch(strength){
            case 1:
                message = message.concat("very weak password.");
                break;
            case 2:
                message = message.concat("weak password.");
                break;
            case 3:
                message = message.concat("strong password.");
                break;
            case 4:
                message = message.concat("very strong password");
                break;
            default:
                message = message.concat("error.");
                break;
        }

        return message;
    }
}

