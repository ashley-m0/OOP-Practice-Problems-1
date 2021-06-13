package ex25.base;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Password {

    private String pas;
    private char[] pasCharacters;

    public Password(String input){
        this.pas = input;
    }

    public void setPassword(String input){
        this.pas = input;
    }
    public String getPassword(){
        return pas;
    }

    public int getLength(){
        return pas.length();
    }

    public int getCharacters(){
        pasCharacters = pas.toCharArray();
        int charCount = 0;
        for (int i = 0; i < pas.length(); i++){
            if (Character.isLetter(pasCharacters[i])){
                charCount++;
            }
        }
        return charCount;
    }

    public int getDigits(){
        pasCharacters = pas.toCharArray();
        int digCount = 0;
        for (int i = 0; i < pas.length(); i++){
            if (Character.isDigit(pasCharacters[i])){
                digCount++;
            }
        }
        return digCount;
    }

    public int getSpecial(){
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(pas);
        if(matcher.find())
            return 1;
        else
            return 0;
    }
}
