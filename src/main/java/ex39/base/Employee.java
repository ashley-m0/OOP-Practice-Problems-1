package ex39.base;

public class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private String seperationDate;

    public Employee(String first, String last, String position, String date){
        this.firstName = first;
        this.lastName = last;
        this.position = position;
        this.seperationDate = date;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPosition(){
        return position;
    }

    public String getSeperationDate(){
        return seperationDate;
    }
}
