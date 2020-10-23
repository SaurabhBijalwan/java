import java.util.*;
import java.util.stream.Collectors;

class Employee
{
    int id;
     
    String name;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
     
    public int getId() 
    {
        return id;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public int getAge() 
    {
        return age;
    }
     
    public String getGender() 
    {
        return gender;
    }
     
    public String getDepartment() 
    {
        return department;
    }
     
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
     
    public double getSalary() 
    {
        return salary;
    }
     
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
}

public class Java8RealTimeEx {

public static void main(String args[]){

System.out.println("Java8RealTimeEx");
List<Employee> employeeList = new ArrayList<Employee>();
         
employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


System.out.println();
System.out.println("Query 3.1 : How many male and female employees are there in the organization?");

/**
For queries such as above where you need to group the input elements, 
use the Collectors.groupingBy() method. In this query, we use 
Collectors.groupingBy() method which takes two arguments. We pass Employee::getGender as first argument
 which groups the input elements based on gender and Collectors.counting() as second argument which counts
  the number of entries in each group.
 */
Map<String, Long> noOfMaleAndFemaleEmployees=
employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
         
System.out.println(noOfMaleAndFemaleEmployees);
System.out.println();
System.out.println("Query 3.2 : Print the name of all departments in the organization?");

/**
Use distinct() method after calling map(Employee::getDepartment) on the stream. It will return unique departments.
 */

 employeeList.stream()
            .map(Employee::getDepartment)
            .distinct()
            .forEach(System.out::println);


System.out.println();
System.out.println("Query 3.3 : What is the average age of male and female employees?");
/**
Use same method as query 3.1 but pass Collectors.averagingInt(Employee::getAge)
 as the second argument to Collectors.groupingBy().
 */

Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
         
System.out.println(avgAgeOfMaleAndFemaleEmployees);

System.out.println();

System.out.println("Query 3.4 : Get the details of highest paid employee in the organization?");
/**
Use Collectors.maxBy() method which returns maximum element wrapped in an Optional object based on supplied Comparator.
 */

 Optional<Employee> highestPaidEmployeeWrapper=
employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
         
Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
         
System.out.println("Details Of Highest Paid Employee : ");
         
System.out.println("==================================");
         
System.out.println("ID : "+highestPaidEmployee.getId());
         
System.out.println("Name : "+highestPaidEmployee.getName());
         
System.out.println("Age : "+highestPaidEmployee.getAge());
         
System.out.println("Gender : "+highestPaidEmployee.getGender());
         
System.out.println("Department : "+highestPaidEmployee.getDepartment());
         
System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());
         
System.out.println("Salary : "+highestPaidEmployee.getSalary());

System.out.println("Query 3.5 : Get the names of all employees who have joined after 2015?");
/**
For such queries which require filtering of input elements, use Stream.filter() 
method which filters input elements according to supplied Predicate.
 */

 employeeList.stream()
            .filter(e -> e.getYearOfJoining() > 2015)
            .map(Employee::getName)
            .forEach(System.out::println);

System.out.println();

}

}

/*
https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
*/