import java.util.*;
import java.util.stream.*;
class MyCollectionL {
    public static void main(String args[]){
    Comparator<Integer> c = (I1,I2)->I1<I2?-1:(I1>I2)?1:0;
    ArrayList<Integer> i = new ArrayList<Integer> ();
        i.add(100);
        i.add(2);
        i.add(3);
        i.add(400);
        i.add(50);
        i.add(1);
        System.out.println(" Printing sequence as you insert the number by default :"+i);
        Collections.sort(i,c);
        System.out.println("Sorted list is printing : "+i);
        i.stream().forEach(System.out::println);
        List<Integer> i2=i.stream().filter(j->j%2==0).collect(Collectors.toList());
        System.out.println("Only Even number is printing"+i2);
}
}