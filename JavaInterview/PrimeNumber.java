import java.io.*;
import  java.util.*;
class PrimeNumber
{
public static void main(String... args){

    int checkNumber=7; //  return 2 if prime
    PrimeNumber primenumber = new PrimeNumber();
    System.out.println(primenumber.isPrime(checkNumber));
}

 public int isPrime(int input1){
  int count=0;
 for(int i=2;i<=Math.sqrt(input1);i++)
{
 if(input1%i==0)
     count++;
}
if(count==0)
 return 2;
 else
return 1;
 }
}

// Check  from 2 to sqrt of number weather number is divisible completely 
// increase count if number%==0
//check the count is greater then 0 then not a prime number 
