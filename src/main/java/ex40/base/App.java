package ex40.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ashley Mojica
 */

import ex39.base.Employee;

import java.util.ArrayList;

/*
Exercise 40 - Filtering Records
Sorting records is helpful, but sometimes you need to filter down the results to find or display
only what you’re looking for.

Given the following data set create a program that lets a user locate all records that match the
search string by comparing the search string to the first or last name field.

First Name	Last Name	Position	        Separation Date
John	    Johnson	    Manager	            2016-12-31
Tou	        Xiong	    Software Engineer	2016-10-05
Michaela	Michaelson	District Manager	2015-12-19
Jake	    Jacobson	Programmer
Jacquelyn	Jackson	    DBA
Sally	    Webber	    Web Developer	    2015-12-18


Example Output
Enter a search string: Jac

Results:
Name                | Position          | Separation Date
--------------------|-------------------|----------------
Jacquelyn Jackson   | DBA               |
Jake Jacobson       | Programmer        |

Constraint:
Store the data using a list of maps.

Challenges:
Make the search case insensitive.
Add the option to search by position.
Add the option to find all employees where their separation date is six months ago or more.
Read in the data from a file.
 */

import java.util.*;

public class App {
    public static void main(String[] args) {
        App myApp = new App();
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> database = new ArrayList<Employee>();
        database = myApp.insertEmployees();

        System.out.print("Enter a search string: ");
        String search = input.nextLine();

        ArrayList<Employee> foundEmployees = new ArrayList<Employee>();
        foundEmployees = myApp.searchEmployees(database, search);
        myApp.generateMessage(foundEmployees);
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

    public ArrayList<Employee> searchEmployees(ArrayList<Employee> database, String search) {
        ArrayList<Employee> foundList = new ArrayList<Employee>();
        int length = database.size();
        int foundCount = 0;
        for (int i = 0; i < length; i++) {
            if (database.get(i).getLastName().contains(search)) {
                foundList.add(foundCount, database.get(i));
                foundCount++;
            } else if(database.get(i).getFirstName().contains(search)){
                foundList.add(foundCount, database.get(i));
                foundCount++;
            }
        }
        return foundList;
    }
    public void generateMessage(ArrayList<Employee> found){
        System.out.println("Name\t\t\t\t| Position\t\t\t| Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        for (int i = 0; i < found.size(); i++){
            String name = found.get(i).getFirstName() + " " + found.get(i).getLastName();
            String position = found.get(i).getPosition();
            String date =  found.get(i).getSeperationDate();
            if (date == null){
                date = " ";
            }
            System.out.format("%20s| %18s| %15s\n", name, position,date);
        }
    }
}
