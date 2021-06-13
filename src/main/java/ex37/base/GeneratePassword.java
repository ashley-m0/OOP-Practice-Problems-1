package ex37.base;

import java.util.Random;

public class GeneratePassword {

    private char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7' , '8', '9'};
    private char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private char[] special = {'!', '@', '#', '$', '%', '^', '&', '*', '<', '>'};

    private Random rand = new Random();

    public char generateRandNum(){
        int index = rand.nextInt(numbers.length);
        return numbers[index];
    }

    public char generateRandLet(){
        int index = rand.nextInt(letters.length);
        return letters[index];
    }

    public char generateRandSpec(){
        int index = rand.nextInt(special.length);
        return special[index];
    }
}
