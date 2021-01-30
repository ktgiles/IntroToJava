/*Kaitlin Giles, Lab 2 Testing Driver, 01/23/2021
Create objects and test methods
*/

public class Giles_lab2 {
    public static void main(String[] args) {

        //establish Person object
        Person person1 = new Person("Ana", "Amari", 60);

        //establish Student object
        Student student1 = new Student("Elizabeth", "Ashe", 28,
                "Arizona University ", "Explosives", 4.00);

        //establish Employee object
        Employee employee1 = new Employee("Angela", "Ziegler",
                37, "Overwatch", "Field Medic", 98000.12);


        //test person methods
//        person1.getFirst();
//        person1.setFirst();
//        person1.getLast();
//        person1.setLast();
//        person1.getAge();
//        person1.setAge();
       System.out.println(person1);

        //test student methods
//        student1.getFirst();
//        student1.setFirst();
//        student1.getLast();
//        student1.setLast();
//        student1.getAge();
//        student1.setAge();
//        student1.getColl();
//        student1.setColl();
//        student1.getMaj();
//        student1.setMaj();
//        student1.getGpa();
//        student1.setGpa();
        System.out.println(student1);

        //test employee methods
//        employee1.getFirst();
//        employee1.setFirst();
//        employee1.getLast();
//        employee1.setLast();
//        employee1.getAge();
//        employee1.setAge();
//        employee1.getEmployer();
//        employee1.setEmployer();
//        employee1.getTitle();
//        employee1.setTitle();
//        employee1.getWage();
//        employee1.setWage();
        System.out.println(employee1);
    }
}
