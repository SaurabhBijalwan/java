interface I4 {
public void m1(String s1);
public void m2(String s2);

}

class FIEX6 {
public static void main(String args[]) {

    I4 d4 = (s1)->System.out.println("calling function" +s1);
    d4.m1(" Saurabh Bijalwan");
}

}

//Rule :Lambda expression can be used where funcation interface ;
// Above funcation is not funcation interface because having two abstract method so 
// Showing error 