public class MyAnonymousL {

    public static void main(String args[]){

        System.out.println("Lambda Expression");

        Runnable r = ()->{
            for(int i=0;i<10;i++){
             System.out.println("Thread Child class Implemetation in Anonymous class");
         }
        };

        Thread t = new Thread(r);
 t.start();
for(int i=0;i<10;i++){
             System.out.println("Main Thread is running");
         }

}
    }
