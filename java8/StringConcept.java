// Java program to compare performance 
// of string literal and string object 

class Customer
{
public Customer(String name){
this.name= name;

}

public String name ;
public int age;

public void setAge(int name){
	this.age=age;
	}
	public String getAge(){
	
	return age;
	}


public void setName(String name){
this.name=name;
}
public String getName(){

return name;
}


}

public class StringConcept { 

public  void rename(Customer c1){
//c1.setName("Gaurav");
/c1.setAge(50);
}

public  Customer rename2(Customer c1){
	c1.setName("Gaurav");
	
	}

	public static void main(String args[]) 
	{	 
		
System.out.println("Running");
Customer c = new Customer("Saurabh");
Customer c = new Customer("Saurabh");
rename(c);
Customer c2 =rename2(c);
System.out.println(c.getName());
System.out.println(c2.getName());


System.out.println();

// Initialization time for String 
		// Literal 
		long start1 = System.currentTimeMillis(); 
		
		for (int i = 0; i < 10000; i++) 
		{ 
			String s1 = "GeeksForGeeks"; 
			String s2 = "Welcome"; 
		} 
		
		long end1 = System.currentTimeMillis(); 
		long total_time = end1 - start1; 

		System.out.println("Time taken to execute"+ 
				" string literal = " + total_time); 

		// Initialization time for String 
		// object 
		long start2 = System.currentTimeMillis(); 
		
		for (int i = 0; i < 10000; i++) 
		{ 
			String s3 = new String("GeeksForGeeks"); 
			String s4 = new String("Welcome"); 
		} 
		
		long end2 = System.currentTimeMillis(); 
		long total_time1 = end2 - start2; 

		System.out.println("Time taken to execute"+ 
				" string object=" + total_time1); 
	} 
} 
