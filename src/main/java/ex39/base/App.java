package ex39.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ashley Mojica
 */

/*
Exercise 39 - Sorting Records
When you’re looking at results, you’ll want to be able to sort them so you can find what you’re
looking for quickly or do some quick visual comparisons.

Given the following data set, create a program that sorts all employees by last name and prints
them to the screen in a tabular format.

First Name	Last Name	Position	        Separation Date
John	    Johnson	    Manager	            2016-12-31
Tou	        Xiong	    Software Engineer	2016-10-05
Michaela	Michaelson	District Manager	2015-12-19
Jake	    Jacobson	Programmer
Jacquelyn	Jackson	    DBA
Sally	    Webber	    Web Developer	    2015-12-18


Example Output:
Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |
John Johnson        | Manager           | 2016-12-31
Michaela Michaelson | District Manager  | 2015-12-19
Sally Weber         | Web Developer     | 2015-12-18
Tou Xiong           | Software Engineer | 2016-10-05

Constraint:
Store the data using a list of maps.

Challenges:
Prompt for how the records should be sorted. Allow sorting by separation date, position, or last name.
Use a database such as MySQL, or a key-value store such as Redis, to store the employee records. Retrieve the records from the data store.
 */
import java.util.*;

public class App {
    public static void main(String[] args) {
        App myApp = new App();
        ArrayList<Employee> database = new ArrayList<Employee>();
        database = myApp.insertEmployees();
        database = myApp.sortEmployees(database);
        myApp.generateMessage(database);
    }

    public ArrayList<Employee> insertEmployees(){
        ArrayList<Employee> database = new ArrayList<Employee>();
        Employee emp1 = new Employee("John", "Johnson", "Manager", "2016-12-31");
        database.add(emp1);
        Employee emp2 = new Employee("Tou","Xiong", "Software Engineer", "2016-10-05");
        database.add(emp2);
        Employee emp3 = new Employee("Michaela","Michaelson", "District Manager","2015-12-19");
        database.add(emp3);
        Employee emp4 = new Employee("Jake","Jacobson","Programmer", null);
        database.add(emp4);
        Employee emp5 = new Employee("Jacquelyn", "Jackson", "DBA", null);
        database.add(emp5);
        Employee emp6 = new Employee("Sally","Webber", "Web Developer", "2015-12-18");
        database.add(emp6);

        return database;
    }

    public ArrayList<Employee> sortEmployees(ArrayList<Employee> database) {
        ArrayList<Employee> newList = new ArrayList<Employee>();
        int alphaIndex = 0;
        int length = database.size();
        for (int i = 0; i < length; i++) {
            alphaIndex = 0;
            for (int j = 0; j < database.size(); j++) {
                if (database.get(j).getLastName().compareTo(database.get(alphaIndex).getLastName()) < 0 && !database.get(j).getLastName().isEmpty()) {
                    alphaIndex = j;
                }
            }
            newList.add(i, database.get(alphaIndex));
            database.remove(alphaIndex);
        }
        return newList;
    }
    public void generateMessage(ArrayList<Employee> database){
        System.out.println("Name\t\t\t\t| Position\t\t\t| Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        for (int i = 0; i < database.size(); i++){
            String name = database.get(i).getFirstName() + " " + database.get(i).getLastName();
            String position = database.get(i).getPosition();
            String date =  database.get(i).getSeperationDate();
            if (date == null){
                date = " ";
            }
            System.out.format("%20s| %18s| %15s\n", name, position,date);
        }
    }
}
