package ex32.base;


public class Game {

    private int number;

    public void setNumber(int num){
        this.number = num;
    }

    public int guessNumber(String guess){
        System.out.print(guess);
        char[] inputArray = guess.toCharArray();
        int correct = 0;
        for (int i = 0 ; i < guess.length(); i++){
            if (Character.isDigit(inputArray[i])){
                correct++;
            }
        }
        //case if the user input was invalid
        if(correct != guess.length()){
            return 3;
        }

        int val = Integer.parseInt(guess);

        //case if user guesses the correct number
        if (val == number){
            return 0;
            //case if the guess was too low
        } else if (val < number){
            return 1;
            //case if the guess was too high
        } else {
            return 2;
        }
    }
}
