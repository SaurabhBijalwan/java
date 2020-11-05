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

// Requirement Input String and return type is Integer
Function<String,Integer> f1 =(s)->s.length();
System.out.println(f1.apply("saurabh"));// 7

TcsEmployeeDetail emp = new TcsEmployeeDetail(90,"Saurabh Bijalwan");
TcsEmployeeDetail emp1 = new TcsEmployeeDetail(61,"Rakesh");

Function<TcsEmployeeDetail,String> f2 = (employee)-> {
    int score =employee.marks;
    if(score>70) return "Grade A -Distinction";
    if(score>60) return "Grade B -First";
    if(score>50) return "Grade C -Second";
    if(score>40) return "Grade D -Passed";
    else return "Grade E -Failed";
    
};

System.out.println(f2.apply(emp));
System.out.println(f2.apply(emp1));

// If marks 60 then only return 


Predicate<TcsEmployeeDetail> p2 =(i)->p.marks>60;
TcsEmployeeDetail [] employees ={
    new TcsEmployeeDetail(10,"Employee1"),
    new TcsEmployeeDetail(60,"Employee2"),
    new TcsEmployeeDetail(70,"Employee3"),
    new TcsEmployeeDetail(80,"Employee4"),
 };
System.out.println("Searching and printing Empoyee having greater than 60 marks  ");
for(TcsEmployeeDetail emp : employees){
    if(p2.test(emp)) System.out.println(emp.name +"-"+emp.marks);
}
 
    }
}

class TcsEmployeeDetail {
    int marks ;
    String name;
    //String grade;
    TcsEmployeeDetail(int m ,String n){
        this.marks =m;
        this.name=n;
    }
}