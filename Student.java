package OOPs;

// default access modifier : only within the same package.
// public access modifier : anywhere in different package also.
// private access modifier : only within the same class.
public class Student {
    public String name;
    // private int rollNumber;

    //--static data : one data which is shared by everybody is called static data.
    //static int numStudents;
    private static int numStudents;

    //--final keyword : the value of rollNumber should not change and you can only
    // set rollNumber in final itself and constructor.
    // private final int rollNumber=100;
    private final int rollNumber;

    //-- Constructor making
    // public Student() {
    // rollNumber = 100;
    // }

    // public Student(String n) {
    // name = n;
    // }

    // public Student(String n, int rn) {
    // name = n;
    // rollNumber = rn;
    // }

    public static int getNumStudents(){
        return numStudents;
    }

    //--this keyword : if we want the local member and data member name should be
    // same.
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        numStudents++;
    }

    //-- set roll number
    // public void setRollNumber(int rn) {
    // if (rn <= 0) {
    // return;
    // }
    // rollNumber = rn;
    // }

    //-- get roll number
    public int getRollNumber() {
        return rollNumber;
    }

    //--print function
    public void print() {
        System.out.println(name + " : " + rollNumber);
    }

}
