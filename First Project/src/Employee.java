/*Kaitlin Giles, Lab 2 Requirement 3, 01/23/2021
Create Employee Class
*/
import java.util.Scanner;
class Employee extends Person {

    //establish variables
    String employer;
    String jobTitle;
    double salary;
    Scanner input = new Scanner(System.in);

    //constructor method to build Employee class by extending Person
    public Employee(String fname, String lname, int age, String empl, String title, double wage) {
        super(fname, lname, age);
        employer = empl;
        jobTitle = title;
        salary = wage;
    }

    //this method prints Employee employer name
    public void getEmployer(){
        System.out.println("The employee's employer is " + this.employer);
    }

    //this method sets Employee employer
    public void setEmployer(){
        System.out.println("Enter the employee's employer: ");
        this.employer = input.nextLine();
    }

    //this method prints Employee job title
    public void getTitle(){
        System.out.println("The employee's job title is " + this.jobTitle);
    }

    //this method sets Employee job title
    public void setTitle(){
        System.out.println("Enter the employee's job title: ");
        this.jobTitle = input.nextLine();
    }

    //this method prints Employee salary
    public void getWage(){
        System.out.println("The employee's salary is $" + this.salary);
    }

    //this method sets Employee salary
    public void setWage(){
        System.out.println("Enter the employee's salary: ");
        this.salary = input.nextDouble();
    }

    //this method prints all employee information
    //by overriding toString
    public String toString(){
        return "Available information for this employee: " + fname + " "
                + lname + ", " + employer + ", " + jobTitle + ", salary: $" + salary;
    }

    // THIS IS A TEST
}
