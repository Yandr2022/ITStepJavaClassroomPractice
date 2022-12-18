package itStep.yandr.javaLessons.lesson50;

import java.util.ArrayList;
import java.util.Collection;

public class CastingTest {
    static void welcomeToTheClub(Person...persons){
        for (Person p:persons) {
           p.sayHello();
           p.drink();
           p.dance();
           if (p instanceof Student){
               Student student = (Student) p;
               System.out.println(student.getAvg());
           }else if (p.getClass()== GoodEmployee.class){
               ((GoodEmployee)p).salary +=500;
           }
        }

    }
    public static void main(String[] args) {
        Person p = new Person();
        Object o = p;
        Person p1 = (Person) o;
welcomeToTheClub(new Person(),new Employee(),new Employee(),new Employee(),new Student(), new BadEmployee());

//        String s1 = new Employee();
//        Object o2 = "";
//
//        if (p1 instanceof Employee) {
//            Employee e1 = (Employee) p1;
//        } else if (p1.getClass() == Student.class) {
//            Student s1 = (Student) p1;
//            System.out.println(s1.getAvg());
//        }
//        String s;
//        Object o2 = "abc";
//        Object o3 = 3;
//        Collection coll = new ArrayList();
//        Object o5 = new BadEmployee();
//        if (o5 instanceof Employee){
//            ((Employee)o5).drink();
//        }
    }
}

class Person {

    public String getName() {
        return name;
    }

    String name;

    void sayHello() {
        System.out.println("Hi there, my name is " + name);
    }

    void drink() {

    }
    void dance(){

    }
}

class Student extends Person {
    double avg;

    public double getAvg() {
        return avg;
    }

    @Override
    void drink() {
        System.out.println("Drinking Beer...");
    }

    @Override
    void dance() {
        drink();
        drink();
        drink();
        System.out.println(getName()+" dancing...");
    }
}

class Employee extends Person {
    double salary;

    public double getSalary() {
        return salary;
    }

    @Override
    void drink() {
        System.out.println("Drinking Wine...");
    }

    void drink(int num, String color) {
        for (int i = 0; i < num; i++) {
            System.out.println("Drinking " + color + " Wine...");
        }

    }

    @Override
    void dance() {
        drink(2,"Red");
        System.out.println(getName()+" dancing...");
    }
}

class BadEmployee extends Employee {
    @Override
    void drink() {
        System.out.println("Drinking Vodka...");
    }
}

class GoodEmployee extends Employee {
    @Override
    void drink() {
        System.out.println("Drinking Water...");
    }
}
