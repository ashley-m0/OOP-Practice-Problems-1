package ex02;

public class CharacterCounter {
    private String characterString;
    private int length;

    public void setCharacterString(String characterString) {
        this.characterString = characterString;
        this.length = characterString.length();
    }

    @Override
    public String toString() {
        return characterString + " has " + length + " characters.";
    }
}
