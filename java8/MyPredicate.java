import java.util.function.*;
import java.util.*;
public class MyPredicate {

    public static void main(String args[]){

        Predicate<Integer> p = i->i%2==0;
        
        System.out.println(p.test(10)); //true
        System.out.println(p.test(11)); //false
    }
}