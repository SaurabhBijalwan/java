//https://www.youtube.com/watch?v=5duxFiseLRE

import java.util.*;
import java.util.stream.*;
import java.util.function.*;
//import java.util.stream.Collectors;
public class PracticeStream
{
public static void main(String args[]){

    // When to go for collection and when to go for Stream ?
    // if you want to store group of collection go for Collection 
    // if you want to process the Collection item go for stream 


    ArrayList<Integer> l = new ArrayList<Integer>();
    l.add(0);
    l.add(10);
    l.add(15);
    l.add(20);
    // Priting list elements here
    System.out.println(l);

// Using filter for even number and using collect to Collectors.Tolist 
   // Fitler Concept
   List<Integer> l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
   List<Integer> l2=l.stream().filter(i->i%2!=0).collect(Collectors.toList());
   List<Integer> l3=l.stream().filter(i->i>15).collect(Collectors.toList());
   System.out.println("Filter Concept : even number " +l1);
   System.out.println("Filter Concept : odd number " +l2);
   System.out.println("Filter Concept : Greater Than number " +l3);
   // Marks 
ArrayList<Integer> marks = new ArrayList<Integer>();
    marks.add(70);
    marks.add(60);
    marks.add(15);
    marks.add(20);
    marks.add(45);
    marks.add(30);
    System.out.println();
    System.out.println("Student Marks :" +marks);

    // Can you add 5 grace marks 
    // Concept of Map
    List<Integer> gracemarks= marks.stream().map(i->i+5).collect(Collectors.toList());
    System.out.println();
    System.out.println("Map concept : Grace marks 5 added to list : " +gracemarks);

   // System.err.println("When we go for filter and when go for Map ?");
    //System.err.println("if you to add some operation to collection else for filter");

    // Java 8 main concept is concise code 
    // Java perople copied concept of functional programming for concise code by lefting their EGO

// List of passed student
List<Integer> passedStudent =marks.stream().filter(i->i>9).collect(Collectors.toList());
System.out.println();
System.out.println("passedStudent :" +passedStudent);
    
 // Add 5 grace and then filter 
 List<Integer> GracePassed = marks.stream().map(j->j+5).filter(i->i>9).collect(Collectors.toList());
 System.out.println();
 System.out.println("GracedpassedStudent :" +GracePassed);

// Number of failed student
Long numberOfStudent =marks.stream().filter(i->i<35).count();
System.out.println();
System.out.println("numberOfStudent :" +numberOfStudent);

// Listof Sorted marks
// default sorting is using comparable interface contacin compareTo method 
List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
System.out.println();
System.out.println("Sorted Marks .sorted().: Mehtod1 "+sortedMarks);
 
 // It is just like above bydefault sorted method is working like this 
 List<Integer> sortedMarksStyle2 = marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
 System.out.println();
 System.out.println("Sorted Marks: Method2  sorted((i1,i2)->i1.compareTo(i2)) " + sortedMarksStyle2);
 
 // reverse using compareTo using - symbol
 List<Integer> reverseSortedMarksStyle2 =marks.stream().sorted((i1,i2)-> - i1.compareTo(i2)).collect(Collectors.toList());
System.out.println();
System.out.println("Reverese Sorted Marks sorted((i1,i2)-> - i1.compareTo(i2)): Method2 " + reverseSortedMarksStyle2);
 
 //reverse using interchage i1 and i2 
 List<Integer> reverseSortedUsingChangingI1andI2Postion = marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
 System.out.println();
 System.out.println("Reverse Sorted changing sorted((i1,i2)->i2.compareTo(i1)) " +reverseSortedUsingChangingI1andI2Postion);


 // Customize sorting using Comparator --> compare method 
 // List reverse  sorted marks
//  Comparator -->compare(obj1,obj2)
// return -ve iff Obj1 has to come before obj2
// return +ve iff obj1 has come after obj2
// retun 0 iff obj1 and Obj2 are equals
//(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0
 List<Integer> sortedMarksDesc = marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
 System.out.println();
 System.out.println("Sorted Desc Marks : "+sortedMarksDesc);

 
// Comparable -compareTo() --> Natural sorting order i.e ascending order
// Comparator --compare() --> Reverse sorting order 


ArrayList<String> starList = new ArrayList<String>();
starList.add("Saurabh Bijalwan");
starList.add("Gaurav Bijalwan");
starList.add("Swati Bijalwan");
starList.add("Swati Bijalwan");
//starList.add("Madhu Bijalwan");
//starList.add("Archana Bijalwan");
//starList.add("Puneet Budakoti");
//starList.add("Puneet Budakoti");

List<String> ascendingSorting = starList.stream().sorted().collect(Collectors.toList());
System.out.println();
System.out.println("Name wise Sorting : " +ascendingSorting);

List<String> LengthWiseAscending = starList.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
System.out.println();
System.out.println("Name wise Sorting : " +LengthWiseAscending);

// Increasing length wise order
Comparator<String> c= (s1,s2) ->{
int m1 = s1.length();
int m2 = s2.length();
if(m1<m2) return -1;
else if(m1>m2) return 1;
else  return s1.compareTo(s2);

};


List<String> LengthWiseAscending1 = starList.stream().sorted(c).collect(Collectors.toList());
System.out.println();
System.out.println("Name wise Sorting : " +LengthWiseAscending1);


// removing duplicate using distinct() function 
List<String> removeDuplicate = starList.stream().distinct().collect(Collectors.toList());
System.out.println();
System.out.println(".distinct(). Removed Duplicates " + removeDuplicate);
System.out.println();
// How to use forEarch and distinct 
starList.stream().distinct().forEach(e->System.out.println(e));


// Concept ForEach 
starList.stream().forEach(System.out::println);
System.out.println();
starList.stream().distinct().forEach(System.out::println);

// Concept of Consumer funcational interface java.uti.function.Consumer;
System.out.println("forEach(consumer) Concept of Consumer functional interface java.uti.function.Consumer; Consumer<String> consumer");
Consumer<String> consumer =i->{System.out.println("star Name is " + i + " ok ");};
starList.stream().forEach(consumer);


System.out.println();
System.out.println("Just directly write consumer function code inside the forEach() method as above");
starList.stream().forEach((i)->{System.out.println("star Name is " + i + " ok ");});

System.out.println();
System.out.println("concept stream to arraylist");
// concept stream to arraylist
Integer [] array = marks.stream().toArray(Integer[]::new);
for(int arr : array){
System.out.print(" "+arr+" ");
}

System.out.println();
//Convert the array to stream
System.out.println("Convert the array to stream");
Stream.of(array).forEach(System.out::println);

System.out.println();

// Concept of min and max 

System.out.println("Concept of min and max ");
int min =marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
System.out.println("min((i1,i2)->i1.compareTo(i2))  "+min);

int max= marks.stream().max((i1,i2)->i1.compareTo(i2)).get();
System.out.println("max((i1,i2)->i1.compareTo(i2)) " +max);
}

}