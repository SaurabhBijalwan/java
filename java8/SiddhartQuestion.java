Reason 1 : Removing abstract class 
Reason 2 : Interface is lighter than class 

Delegates 
Multple delegates 
funcation pointer 

funcation ko pass kr dete ho as parameter 
:: class by reference 

interface Contract1 {

    m1();
    m2();
    m3();
    //
 UpIpayment();
    DetectYourBak();
    saurabhBody(){};
    method(){}
}

interface Contract2  implements Contract {

    UpIpayment(){};
    DetectYourBak(){};
}

abstract class Contract implements Contract1 {

m1() {};
    m2(){};
    m3(){};
 UpIpayment(){};
    DetectYourBak(){};

}

class SiddhartSolution implemnets Contract {

 m1() {};
    m2(){};
    m3(){};
    //
    UpIpayment(){};
}


class ConcereteClassD1 implemnets Contract  {
  m1() {
      ///

  };
    m2() {};
    m3() {};

}
class ConcereteClassD2 implemnets Contract  {
  m1() {
      ///

  };
    m2() {};
    m3() {}
    ;

}

class Demo {
    public static void main(String args[]){
Contract contactDemo = new ConcereteClassD2();
contactDemo.m1();//Run
contactDemo.m2();//Run
contactDemo.m3();//Run
contactDemo.UpIpayment(); //Not run defination not available 

SiddhartSolution.UpIpayment();//Run 

    }
}

interface SP1 {


 default void m1(){

    System.out.println("SP1 Method m1()");
} */
}

interface SP2 {

/* public void m1(){

    System.out.println("SP2 Method m1()");
} */
}

class SC implements SP1 , SP2 {
m1(){
Sp2.super().m1();

}


}

public class SiddhartQuestion {

public static void main(String args[]){

    SC s = new SC();
    s.m1();
}

}