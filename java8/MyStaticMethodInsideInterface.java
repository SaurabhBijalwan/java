interface I {

    public static void m1(){
        System.out.println("Satic method");
    }
}

public class MyStaticMethodInsideInterface implements I {
 public static void m1(){
       // System.out.println("Main method");
       I.super.m1();
    }
    public static void main(String args[]){

        I.m1();
        m1();
    }
}