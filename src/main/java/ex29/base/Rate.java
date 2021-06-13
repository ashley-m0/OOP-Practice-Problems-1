package ex29.base;

public class Rate {

    private int rate = 0;

    public void setRate(String input){
        char[] inputArray = input.toCharArray();
        int correct = 0;
        for (int i = 0 ; i < input.length(); i++){
            if (Character.isDigit(inputArray[i])){
                correct++;
            }
        }
        if(correct == input.length()){
            int val = Integer.parseInt(input);
            this.rate = val;
        }
    }

    public int getRate(){
        return rate;
    }
}
