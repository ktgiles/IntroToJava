/*Kaitlin Giles, Lab 2 Requirement 2, 01/23/2021
Create Student Class
*/
import java.util.Scanner;
class Student extends Person {

    //establish variables
    String college;
    String major;
    double gpa;
    Scanner input = new Scanner(System.in);

    //constructor method to build Student object by extending Person class
    public Student(String fname, String lname, int age, String coll, String maj, double grade) {
        super(fname, lname, age);
        college = coll;
        major = maj;
        gpa = grade;
    }

    //this method prints Student college
    public void getColl(){
        System.out.println("The student's college is " + this.college);
    }

    //this method sets Student college
    public void setColl(){
        System.out.println("Enter the student's college: ");
        this.college = input.nextLine();
    }

    //this method prints Student's major
    public void getMaj(){
        System.out.println("The student's major is " + this.major);
    }

    //this method sets Student's major
    public void setMaj(){
        System.out.println("Enter the student's major: ");
        this.major = input.nextLine();
    }

    //this method prints Student's GPA
    public void getGpa(){
        System.out.println("The student's GPA is " + this.gpa);
    }

    //this method sets Student's GPA
    public void setGpa(){
        System.out.println("Enter the student's GPA: ");
        this.gpa = input.nextDouble();
    }

    //this method prints all student information
    //by overriding toString
    public String toString(){
        return "Available information for this student: " + fname + " " + lname + ", " + college + ", "
                + major + " major, GPA: " + gpa;
    }
}
