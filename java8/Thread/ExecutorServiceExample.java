import java.util.concurrent.*;

public class ExecutorServiceExample {  
  
    public static void main(String[] args) {  
        ExecutorService executorService = Executors.newFixedThreadPool(10);  
        executorService.execute(new Runnable() {  
              
            @Override  
            public void run() {  
                System.out.println("ExecutorService");  
                  
            }  
        });  
        executorService.shutdown();  
    }  
  
}  