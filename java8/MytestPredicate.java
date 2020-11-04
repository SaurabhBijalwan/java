import java.util.function.*;

public class MytestPredicate{

    public static void main(String args[]){
Predicate<Integer> p =(i)->i%2==0?true:false;
System.out.println( "Predicate<Integer> p =(i)->i%2==0?true:false; Input 1 "+p.test(1));//false;
System.out.println( "Predicate<Integer> p =(i)->i%2==0?true:false; Input 2 "+p.test(1));//false;

// Write the predicate to check weather the length is greater then 10 or not 
Predicate<String> p1 =(i)->i.length()>10?true:false;
System.out.println("Saurabh Bijalwan "+p1.test("Saurabh Bijalwan"));
System.out.println("Saurabh "+p1.test("Saurabh"));

//filter from list working 
Function<Integer,Integer> f = (i)->i*i;
System.out.println(f.apply(6)); //36
System.out.println(f.apply(9)); //36

    }
}