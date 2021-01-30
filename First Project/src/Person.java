/*Kaitlin Giles, Lab 2 Requirement 1, 01/23/2021
Create Person Class
*/
import java.util.Scanner;
public class Person {

    //establish variables
    String fname;
    String lname;
    int age;
    Scanner input = new Scanner(System.in);

    //constructor method to build Person object
    public Person(String first, String last, int years) {
        fname = first;
        lname = last;
        age = years;
    }

    //this method gets Person first name
    public String getFirst(){
        return this.fname;
    }

    //this method sets Person first name
    public void setFirst(){
        System.out.println("Enter the person's first name: ");
        this.fname = input.nextLine();
    }

    //this method gets Person last name
    public String getLast(){
        return this.lname;
    }

    //this method sets Person last name
    public void setLast(){
        System.out.println("Enter the person's last name: ");
        this.lname = input.nextLine();
    }

    //this method gets Person age
    public Integer getAge(){
        return this.age;
    }

    //this method sets Person age
    public void setAge(){
        System.out.println("Enter the person's age: ");
        this.age = input.nextInt();
    }

    //this method prints all person information
    //by overriding toString
    public String toString(){
        return "Available information for this person: " + fname + " " +
               lname + ", " + age + " years old.";
    }
}
