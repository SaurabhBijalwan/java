// Find the unique character from a String

public class Interview3 {
    public static void main(String args[]) {
     StringBuffer givenString = new StringBuffer("AABBBCCC");
     StringBuffer uniqueString = new StringBuffer();
     int i=0;
     char selectedcharcter;
     while(i<givenString.length()){
          
        selectedcharcter = givenString.charAt(i);
         if(uniqueString.length()<1) uniqueString.append(selectedcharcter);
       else {
            
         int j=0;
         boolean found =false;
         int count;
         while(j<uniqueString.length()){
             if(selectedcharcter==uniqueString.charAt(j)) found=true; 
             
             j++;
         }
         if(!found) uniqueString.append(selectedcharcter);
         // System.out.println("selectedcharcter:"+selectedcharcter+":"+found +":"+uniqueString);
         
         
        
       }
        
         
         i++;
     }
     
     System.out.println(uniqueString);//AB
     
     StringBuffer uniqueElementWithCount = new StringBuffer();
      int indexForRepeatedCount=0;
         char uniqueCharacter;
         while(indexForRepeatedCount < uniqueString.length()){
            // System.out.println("indexForRepeatedCount:"+indexForRepeatedCount);
             int RepeatedCount=0;
             int indexForgivenString =0;
            // char uniqueCharacter=uniqueString.charAt(indexForRepeatedCount);
             uniqueCharacter=uniqueString.charAt(indexForRepeatedCount);
             
             while(indexForgivenString<givenString.length()){
                  if(uniqueCharacter==givenString.charAt(indexForgivenString)) RepeatedCount=RepeatedCount+1;
                  //System.out.println("indexForgivenString:"+indexForgivenString);
                 indexForgivenString++;
             }//while(indexForgivenString<givenString.length())
             
             uniqueElementWithCount.append(uniqueCharacter+"-"+RepeatedCount+" ");
           // System.out.println("indexForgivenString:"+indexForgivenString+"uniqueCharacter:"+uniqueCharacter+"-"+RepeatedCount);
             indexForRepeatedCount++;
         }// while(indexForRepeatedCount < uniqueString.length())
     
         System.out.println(uniqueElementWithCount); // A-2 B-3 C-3
     
     
    }
}