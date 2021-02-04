// Find the unique character from a String

public class Interview2 {
    public static void main(String args[]) {
     StringBuffer givenString = new StringBuffer("AAAABBBBBBBBBBBCCCCC");
     StringBuffer uniqueString = new StringBuffer();
     int i=0;
     char selectedcharcter;
     while(i<givenString.length()){
          
        selectedcharcter = givenString.charAt(i);
         if(uniqueString.length()<1) uniqueString.append(selectedcharcter);
       else {
            
         int j=0,found =-1;
         while(j<uniqueString.length()){
             if(selectedcharcter==uniqueString.charAt(j)) found=found+1;
             
             j++;
         }
         if(found < 0) uniqueString.append(selectedcharcter);
         // System.out.println("selectedcharcter:"+selectedcharcter+":"+found +":"+uniqueString);
       }
        
         
         i++;
     }
     
     System.out.println(uniqueString);
    }
}