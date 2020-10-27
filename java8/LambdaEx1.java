
import java.util.function.*; 

class LambdaEx1{
    
    public static void main(String args[]){

Function<Integer , Integer> f =i-> i*i;

System.out.println(f.apply(10));



    }
    
    }



/**
import java.util.function.Function; 

public class LambdaEx1 { 
	public static void main(String args[]) 
	{ 

		// Function which takes in a number 
		// and returns half of it 
		Function<Integer, Double> half = a -> a / 2.0; 

		// apply the function to get the result 
		System.out.println(half.apply(10)); 
	} 
} 

 */

