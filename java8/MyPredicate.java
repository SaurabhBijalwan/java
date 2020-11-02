import java.util.function.*;
import java.util.*;
public class MyPredicate {

    public static void main(String args[]){

        Predicate<Integer> p = i->i%2==0;

        System.out.println(p.test(10)); //true
        System.out.println(p.test(11)); //false

        TCSEmployee e1 = new TCSEmployee(100000,true);
        Predicate<TCSEmployee> p1 =emp->emp.salary<10000 && emp.hasGF==true;
        System.out.println(p1.test(e1));
    }
}

class TCSEmployee {
 int salary ;
boolean hasGF ;
TCSEmployee(int salary ,boolean hasGF){
    this.salary=salary;
    this.hasGF=hasGF;
}



}