// Find the 

public class Interview4 {
    public static void main(String args[]) {
     StringBuffer givenString = new StringBuffer("AABBBCCCBBBB");// input String
     char searchingChar='B';//input
     int occurance =6;//input 
     
     int startIndex=0;
     int numberOftime=0;
     int positionOfCharacter=-1;
     while(startIndex < givenString.length()){
         if(searchingChar==givenString.charAt(startIndex)) numberOftime=numberOftime+1;
         
         if(numberOftime==occurance) positionOfCharacter=startIndex ;
         
         startIndex++;
     }
    
     if(positionOfCharacter>-1) System.out.println(givenString +" Contains " +searchingChar +" " +occurance +" occurance at position " +positionOfCharacter); //AABBBCCCBBBB Contains B 6 occurance at position 10
     else System.out.println("No Found");
     
    
         
    }
}