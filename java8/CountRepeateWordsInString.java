import java.util.stream.*;
import java.util.*;
import java.util.function.*;  
import java.util.stream.Collectors;
import java.util.AbstractMap.*;

public class CountRepeateWordsInString {

    public static void main(String args[]) {

        System.out.println("Count the number of words repeated in a String ");
        String s = "Hello Saurabh Bijalwan .How are you what are you doing ? are you here Saurabh Bijalwan Mukesh rakesh Swati Bijalwan ?";
      System.out.println();
     System.out.println("Power of Collection only ");
      List<String> list = Arrays.asList(s.split(" "));
       Set<String> uniqueWords = new HashSet<String>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
     
System.out.println();
System.out.println("Power of Stream");
     Map<String, Long> freq =
                    Stream.of(s.split(" "))
                    .collect(Collectors.groupingBy(Function.identity(),
                                            Collectors.counting()));
 
        System.out.println(freq);
     
  
    
    }
}