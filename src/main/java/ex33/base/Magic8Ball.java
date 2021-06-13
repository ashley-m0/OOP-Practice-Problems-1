package ex33.base;

import java.util.Random;

public class Magic8Ball {

    private Random rand = new Random();

    private String[] answer = {"Yes.", "No.", "Maybe.", "Ask again later."};
    private int choice = rand.nextInt(4);

    public String getDecision(){
        return answer[choice];
    }
}
