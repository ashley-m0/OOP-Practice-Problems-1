package ex31.base;

public class KarvonenCalculator {

    private int age = 0;
    private int restingHR = 0;

    public void setAge(String age){
        char[] inputArray = age.toCharArray();
        int correct = 0;
        for (int i = 0 ; i < age.length(); i++){
            if (Character.isDigit(inputArray[i])){
                correct++;
            }
        }
        if(correct == age.length()){
            int val = Integer.parseInt(age);
            this.age = val;
        }
    }

    public int getAge(){
        return age;
    }

    public void setRestingHR(String hr){
        char[] inputArray = hr.toCharArray();
        int correct = 0;
        for (int i = 0 ; i < hr.length(); i++){
            if (Character.isDigit(inputArray[i])){
                correct++;
            }
        }
        if(correct == hr.length()){
            int val = Integer.parseInt(hr);
            this.restingHR = val;
        }
    }

    public int getRestingHR(){
        return restingHR;
    }

    public int getTargetHeartRate(int intensityPercentage){
        double intensity = intensityPercentage / 100.0;
        double targetHR = (((220 - age) - restingHR) * intensity) + restingHR;

        //round up if needed
        double leftover = targetHR % 1.0;
        if (leftover >= 0.50){
            targetHR += 1.0;
        }
        targetHR -= leftover;

        int result = (int)targetHR;
        return result;
    }
}
