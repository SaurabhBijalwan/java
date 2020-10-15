interface Sayable{  
    void say();  
}  
public class Question5EX1 {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = Question5EX1::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}