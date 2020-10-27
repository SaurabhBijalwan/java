/*
interface FIEX1 {
public void m1(); // 1 Abstract method
public void m11(); // 2 Abstract method
public static void m2() {  } // Static Method 
public default void m3() { } // default method 

}
*/

// Without @FunctionalInterface annotation multiple abstract is not showing error so annotation is introduced

@FunctionalInterface
interface FIEX1 {
public void m1(); // 1 Abstract method
public void m11(); // 2 Abstract method
public static void m2() {  } // Static Method 
public default void m3() { } // default method 

}

// @FunctionalInterface not allowing us to make error showing error 
//while above code is not showing error during compilation

//Compile time exception
//multiple abstract method found 
