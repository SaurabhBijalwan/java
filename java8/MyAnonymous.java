public class MyAnonymous {
public static void main(String args[]){
 Runnable r = new Runnable (){
     public void run(){
         for(int i=0;i<10;i++){
             System.out.println("Thread Child class Implemetation in Anonymous class");
         }
     }
 };

 Thread t = new Thread(r);
 t.start();
for(int i=0;i<10;i++){
             System.out.println("Main Thread is running");
         }

}

}