package OOPs;

public class fractionUse {
    public static void main(String[] args) {
        fraction f1= new fraction(20,30);
        f1.print(); //--2/3

        f1.setNumerator(12); //--12/3= 4/1
        int d=f1.getDenominator();
        System.out.println(d); //--1
        f1.print(); //--4

        f1.setNumerator(10);
        f1.setDenominator(30);
        f1.print();  //--1/3

        fraction f2=new fraction(3,4);
        f1.add(f2);
        f1.print(); //--13/12
        f2.print(); //--3/4

        fraction f3=new fraction(4,5);
        f3.multiply(f2);
        f3.print(); //--3/5
        f2.print(); //--3/4

         fraction f4=fraction.add(f1,f3);
        f1.print(); //--13/12
        f3.print(); //--3/5
        f4.print(); //101/60



    }
}
