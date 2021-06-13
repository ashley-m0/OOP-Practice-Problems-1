package ex27.base;


public class Employee {

    private String firstName;
    private String lastName;
    private String zipcode;
    private String employeeID;

    public Employee(String first, String last, String zip, String id){
        this.firstName = first;
        this.lastName = last;
        this.zipcode = zip;
        this.employeeID = id;
    }

    public boolean checkFirstNameLength(){
        if (firstName.length() >= 2){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkFirstNamePresent(){
        if (!firstName.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    public boolean checkLastNameLength(){
        if (lastName.length() >= 2){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkLastNamePresent(){
        if (!lastName.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkEmployeeID(){
        char[] id = employeeID.toCharArray();
        boolean correct = false;

        if(Character.isLetter(id[0]) && Character.isLetter(id[1])){
            if (id[2] == '-'){
                if (Character.isDigit(id[3]) && Character.isDigit(id[4]) && Character.isDigit(id[5]) && Character.isDigit(id[6])){
                        correct = true;
                }

            }
        }
        return correct;
    }

    public boolean checkZip(){
        char[] zip = zipcode.toCharArray();
        int correct = 0;
        for (int i = 0; i < 5; i++){
            if (Character.isDigit(zip[i])){
                correct++;
            }
        }

        if (correct == 5){
            return true;
        } else {
            return false;
        }
    }
}
