package ex15;

public class User {

    private String myUsername;
    private String myPassword;

    public User(String name, String pass){
        myUsername = name;
        myPassword = pass;
    }

    public int checkPassword(String attempt){
        if (attempt.equals(myPassword)){
            return 1;
        } else {
            return 0;
        }
    }
}
