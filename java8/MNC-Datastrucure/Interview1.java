public class Interview1 {
    public static void main(String args[]) {
    StringBuffer sb1= new StringBuffer("nudarheD ta gnivil si eH . yob doog a si hbaruaS");
    System.out.println(sb1);
    int i=0; 
    int j= sb1.length() -1;
    while(i<sb1.length()){
    
    if(j<i) {System.out.println(i);i=  sb1.length();}
     
   else{
            
                char temp =sb1.charAt(i);// saving last element
      sb1.setCharAt(i,sb1.charAt(j));// relacing first lement by last one
      sb1.setCharAt(j,temp); // replacing last element by first one
       i=i+1;// moving to next 
       j=j-1; // moving to back
        }
        
 
    
       System.out.println("i="+i+"j="+j);
    
        
 
        
    }// While(i<sb.length())
    
      System.out.println(sb1);
    }//Main()
    
     static void swap(String s){
        
    }
}