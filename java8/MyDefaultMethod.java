interface P1 {
    default void m1(){
        System.out.println("P1 method");
    }
}

interface P2{
default void m1(){
    System.out.println("P2 Method");
}

}
public class MyDefaultMethod implements P1 ,P2{

    public void m1(){

        //System.out.println("Our Own m1() Method");
       // P1.super.m1();
       P2.super.m1();
    }
    public static void main(String args[]){
MyDefaultMethod test = new MyDefaultMethod();
test.m1(); 

    }
}
// O/p :P2 method"