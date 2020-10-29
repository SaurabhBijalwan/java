interface StaticMethodConcept {
public static void m1(){
    System.out.println("Static M1 method");
}


}

class ImpemetationClass implements StaticMethodConcept {


}

public class MyInterfaceStaticMethod {

    public static void main(String args[]){
ImpemetationClass demo = new ImpemetationClass();
//demo.m1(); // Compile Exception method m1 not found 
StaticMethodConcept.m1();
    }
}