import java.util.function.*;

public class MytestPredicate{

public static void main(String args[]){
// FI for checking even number - R boolean 
Predicate<Integer> p =(i)->i%2==0?true:false;
System.out.println( "Predicate<Integer> p =(i)->i%2==0?true:false; Input 1 "+p.test(1));//false;
System.out.println( "Predicate<Integer> p =(i)->i%2==0?true:false; Input 2 "+p.test(1));//false;

// Write the predicate to check weather the length is greater then 10 or not 
// FI checking length is greater than 10
Predicate<String> p1 =(i)->i.length()>10?true:false;
System.out.println("Saurabh Bijalwan "+p1.test("Saurabh Bijalwan"));
System.out.println("Saurabh "+p1.test("Saurabh"));

//filter from list working 
// FI for Square number - R Userdefeine here Integer
Function<Integer,Integer> f = (i)->i*i;
System.out.println("Function<Integer,Integer> f = (i)->i*i; " +f.apply(6)); //36
System.out.println("Function<Integer,Integer> f = (i)->i*i; "+f.apply(9)); //36

// Requirement Input String and return type is Integer
// FI return length
Function<String,Integer> f1 =(s)->s.length();
System.out.println("Function<String,Integer> f1 =(s)->s.length();"+f1.apply("saurabh"));// 7

TcsEmployeeDetail emp = new TcsEmployeeDetail(90,"Saurabh Bijalwan");
TcsEmployeeDetail emp1 = new TcsEmployeeDetail(61,"Rakesh");

//  FI get the Grade of Employee
Function<TcsEmployeeDetail,String> f2 = (employee)-> {
    int score =employee.marks;
    if(score>70) return "Grade A -Distinction";
    if(score>60) return "Grade B -First";
    if(score>50) return "Grade C -Second";
    if(score>40) return "Grade D -Passed";
    else return "Grade E -Failed";
    
};

System.out.println("Function<TcsEmployeeDetail,String> f2 = (employee)-> { code }" +f2.apply(emp));
System.out.println("Function<TcsEmployeeDetail,String> f2 = (employee)-> { "+f2.apply(emp1));

// If marks 60 then only return 

// function for checking Above 60 Percentage marks return boolean
Predicate<TcsEmployeeDetail> p2 =(i)->i.marks>60;
TcsEmployeeDetail [] employees ={
    new TcsEmployeeDetail(10,"Employee1"),
    new TcsEmployeeDetail(60,"Employee2"),
    new TcsEmployeeDetail(70,"Employee3"),
    new TcsEmployeeDetail(80,"Employee4"),
 };
System.out.println("Searching and printing Empoyee having greater than 60 marks  ");
for(TcsEmployeeDetail empe : employees){
   if(p2.test(emp)) System.out.println("Predicate<TcsEmployeeDetail> p2 =(i)->i.marks>60; "+empe.name +"-"+empe.marks);
}


//Funcation channing explation----accept();
Function<Integer,Integer> f11 =i->i*2;
Function<Integer,Integer> f12 =i->i*i*i;

System.out.println("first f1 i.e 2*2= 4 and then 4*4*4 =64  : "+f11.andThen(f12).apply(2)); // first f1 i.e 2*2= 4 and then 4*4*4 =64 
System.out.println("first f2 i.e 2*2*2= 8 and then 2*8 =16   : "+f11.compose(f12).apply(2)); // first f2 i.e 2*2*2= 8 and then 2*8 =16 


// Consumer input TCS EmployeeDetail print Student Name 
System.out.println("-=====Consumer input TCS EmployeeDetail print Student Name ======");

// Funcation for priting Employee details
Consumer<TcsEmployeeDetail> c1 =(i)->{
System.out.println("Consumer<TcsEmployeeDetail> Name:" +i.name);
System.out.println("Consumer<TcsEmployeeDetail> marks:" +i.marks);

};




for(TcsEmployeeDetail empe : employees){
// Below line checking above 60 or not calling predicate
if(p2.test(empe)){
// calling printing function
   c1.accept(empe); 
   
}  

// Below print all 
//   c1.accept(empe);
}

// function for Supplier input NA return type T -get()
Supplier<Double> s= ()->Math.random();

//calling supplier function
System.out.println("Supplier<Double> s= ()->Math.random();get() ---- > Double :" +s.get());

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