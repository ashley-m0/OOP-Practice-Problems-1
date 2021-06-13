package ex35.base;

import java.util.Random;

public class Contest {

    private Random rand = new Random();

    private String[] entrys = new String[0];

    public void addEntry(String name){
        String[] newArray = new String[entrys.length+1];
        for (int i = 0; i < entrys.length; i++){
            newArray[i] = entrys[i];
        }
        newArray[entrys.length] = name;
        this.entrys = newArray;
    }

    public String pickWinner(){
        int winnerNum = rand.nextInt(entrys.length);
        return entrys[winnerNum];
    }
}
