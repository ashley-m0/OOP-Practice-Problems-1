package ex24.base;

import java.util.Arrays;

public class AnagramChecker {

    private String anagram1;
    private String anagram2;
    private char[] sortedAnagram1;
    private char[] sortedAnagram2;

    private boolean checkLength(){
        if (anagram1.length() == anagram2.length()){
            return true;
        }else{
            return false;
        }
    }

    //constructor for AnagramChecker
    public AnagramChecker(String anagram1, String anagram2){
        this.anagram1 = anagram1;
        this.anagram2 = anagram2;
    }

    public void setAnagram1(String anagram1){
        this.anagram1 = anagram1;
    }

    public void setAnagram2(String anagram2){
        this.anagram2 = anagram2;
    }

    public String getAnagram1(){
        return anagram1;
    }

    public String getAnagram2(){
        return anagram2;
    }

    public boolean isAnagram(){

        if (checkLength()){

            //puts strings into a char array
            sortedAnagram1 = anagram1.toCharArray();
            sortedAnagram2 = anagram2.toCharArray();

            //sorts char arrays
            Arrays.sort(sortedAnagram1);
            Arrays.sort(sortedAnagram2);

            //checks if the char arrays are equal
            Boolean answer = Arrays.equals(sortedAnagram1, sortedAnagram2);

            return answer;
        } else {
            return false;
        }
    }

}
