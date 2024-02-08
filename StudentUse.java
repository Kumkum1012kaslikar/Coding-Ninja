package OOPs;

import java.util.*;

public class StudentUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //--constructor
        Student s1 = new Student("kumkum", 105);

        //--default constructor
        // Student s1 = new Student();

        // System.out.println(s1); // address print

        // s1.name = "Kumkum";
        // s1.setRollNumber(105);

        //--static
       // System.out.println(s1.numStudents);
       // System.out.println(Student.numStudents); //better way to print numStudents
        // System.out.println(s1.getNumStudents());
        //System.out.println(Student.getNumStudents()); //better way to print numStudents

        // System.out.println(s1.name);
        // System.out.println(s1.getRollNumber());

        s1.print();
    }
}
