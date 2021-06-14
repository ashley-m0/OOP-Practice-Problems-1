package ex32.base;


public class Game {

    private int number;

    public void setNumber(int num){
        this.number = num;
    }

    public int guessNumber(String guessString){
        char[] inputArray = guessString.toCharArray();
        int correct = 0;
        for (int i = 0 ; i < guessString.length(); i++){
            if (Character.isDigit(inputArray[i])){
                correct++;
            }
        }
        //indicates the whole string is a number
        if(correct == guessString.length()){
            Integer val = Integer.valueOf(guessString);
            if (val == number){
                return 0;
                //case if the guess was too low
            } else if (val < number){
                return 1;
                //case if the guess was too high
            } else {
                return 2;
            }
        } else {
            return 3;//case if the user input was invalid
        }



    }
}
