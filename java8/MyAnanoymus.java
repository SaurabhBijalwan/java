import java.util.*;
import java.util.stream.*;

class Employee {
String name;
int id;
Employee(int id,String name){ this.id=id;this.name=name;}

 public String toString(){
 return "id: "+id +" name: "+name;
} 
}

public class MyAnanoymus {
public static void main(String args[]){
    Employee emp1 =new Employee(1,"Saurabh");
    ArrayList<Employee> l = new ArrayList<Employee>();
l.add(new Employee(1,"Saurabh"));
l.add(new Employee(2,"Gaurav"));
l.add(new Employee(79,"Swati"));
l.add(new Employee(5,"Neha"));
l.add(new Employee(78,"Ritu"));
System.out.println(emp1); // Without implementing toString() Hashcode is printing 
// After implemeting emp1 internally calling toString() method
System.out.println(" Default as Inserted "+l);

Collections.sort(l,(e1,e2)->(e1.id<e2.id)?-1:(e1.id>e2.id)?1:0); // Lambda Expression Comparator
System.out.println("Sorted Using Empid: "+l);

Collections.sort(l,(e1,e2)-> e1.name.compareTo(e2.name)); // Lambda Expression compareTo
System.out.println("Sorted Using Names: "+l);

}

}