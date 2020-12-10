import java.util.stream.*;
import java.util.*;
import java.util.*;  
import java.util.stream.Collectors;

 public class MyStreamJava8 {

public static void main(String args[]){

    System.out.println("MyStreamJava8");
    // List numbers = Arrays.asList(1,2,3,4);
    // List result = numbers.stream()
    //               .filter(e -> (e % 2)==0)
    //               .map(e -> e * 2)
    //               .collect(Collectors.toList());

    //               System.out.println(result);  

List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 2)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2);  

List number = Arrays.asList(2,3,4,5);
List square = number.stream().map(x->x*x).collect(Collectors.toList());
System.out.println(square);  
}

 }
 class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  