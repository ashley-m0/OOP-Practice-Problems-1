package ex36.base;

public class Data {

    private int[] numbers = new int[0];

    public void addNumber(String numString){
        char[] inputArray = numString.toCharArray();
        int correct = 0;
        for (int i = 0 ; i < numString.length(); i++){
            if (Character.isDigit(inputArray[i])){
                correct++;
            }
        }
        //indicates the whole string is a number
        if(correct == numString.length()){
            int num = Integer.parseInt(numString);
            int[] newArray = new int[numbers.length+1];
            for (int i = 0; i < numbers.length; i++){
                newArray[i] = numbers[i];
            }
            newArray[numbers.length] = num;
            this.numbers = newArray;
        }

    }

    public String getNumbers(){
        String message = "Numbers: ";
        for (int i = 0; i < numbers.length-1 ; i++){
            String numString = String.valueOf(numbers[i]);
            message = message.concat(numString + ", ");
        }
        //so the last element does not have a comma afterwards
        String numString = String.valueOf(numbers[numbers.length-1]);
        message = message.concat(numString);

        return message;
    }

    public double average(){
        double total = 0.0;
        for (int i = 0; i < numbers.length; i++){
            total += numbers[i];
        }
        return (total / numbers.length);
    }

    public int max(){
        int maxNum = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > maxNum){
                maxNum = numbers[i];
            }
        }
        return maxNum;
    }

    public int min(){
        int minNum = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < minNum){
                minNum = numbers[i];
            }
        }
        return minNum;
    }

    public double std(double mean){
        double total = 0.0;
        for (int i = 0; i < numbers.length; i++){
            total += Math.pow((numbers[i] - mean), 2);
        }
        double insideSqrt = total / numbers.length;
        double result = Math.sqrt(insideSqrt);
        return result;
    }
}
