package ex24.base;

import java.util.Arrays;

public class AnagramChecker {

    private String anagram1;
    private String anagram2;

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


}
