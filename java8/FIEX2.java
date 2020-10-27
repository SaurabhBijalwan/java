@FunctionalInterface
interface FIEX2
{
public void m1();
}

@FunctionalInterface
interface FIEX3 extends FIEX2 {
//public void m2();

// Enabling will shows error multiple abstract method

}

// Anotaion is not there 
interface FIEX4 extends FIEX2 {
public void m2(); // abstract method

public void m3(); // abstract method

// This interface is not Funcational Interface so allowing two abstract method i.e m1 and m2

}