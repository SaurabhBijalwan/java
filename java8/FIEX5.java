interface I1 {
    public void m1();
}

interface I2 {
    public void add(int a , int b);
}
interface I3 {
    public void multiply(int a , int b);
}

/**

class Demo1 implements I1 {
public void m1(){
    System.out.println("Implemeting m1");
}
}
*/

public class FIEX5 {

    public static void main(String args[]){
/*
        System.out.println("Calling using Old Style");
        I1 d1 = new Demo1();
        d1.m1();*/

       I1 d2 = ()->System.out.println("Implemeting m1");
       System.out.println("FuncationInterface Calling");
        d2.m1();


        I2 d3 = (a,b) -> System.out.println(a+b);
        d3.add(10,20);

        I3 d4 = (a,b) -> System.out.println(a*b);
        d4.multiply(10,34);

    }
}
