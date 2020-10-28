import java.util.*;

class Mycomparator implements Comparator<Integer> {

public int compare(Integer I1 , Integer I2){

return I1<I2?-1:(I1>I2)?1:0;

  /*   if(I1<I2){
        return -1;
    }
    else if(I1>I2){ return 1;}
    else {return 0;} */
}

}

public class MyCollection {

    public static void main(String args[]){
        ArrayList<Integer> i = new ArrayList<Integer> ();
        i.add(100);
        i.add(2);
        i.add(3);
        i.add(400);
        i.add(50);

        System.out.println(" Printing sequence as you insert the number by default :"+i);

        Collections.sort(i,new Mycomparator());
        System.out.println(i);

    }
}