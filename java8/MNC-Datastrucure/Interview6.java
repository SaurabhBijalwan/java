// Find the Middle Node of a Linked list in a Single-pass
//import java. util.*;
class Interview6 {
public static void main(String [] args){
    System.out.println("Find the Middle Node of a Linked list in a Single-pass ?");

    LinkedList l1 = new LinkedList();
    
  
    l1.add( new LinkedList.Node("1"));
    l1.add( new LinkedList.Node("2"));
    l1.add( new LinkedList.Node("3"));
    l1.add( new LinkedList.Node("4"));
    l1.add( new LinkedList.Node("5"));
    l1.add( new LinkedList.Node("6"));
    l1.add( new LinkedList.Node("7"));
    l1.add( new LinkedList.Node("8"));
    l1.add( new LinkedList.Node("9"));
    l1.add( new LinkedList.Node("10"));
    l1.add( new LinkedList.Node("11"));
    l1.add( new LinkedList.Node("12"));
    l1.add( new LinkedList.Node("13"));
    l1.add( new LinkedList.Node("25"));
 System.out.println(l1);

   LinkedList.Node head = l1.head();

 // Travese once and find the middle 
 LinkedList.Node current = head ;
 LinkedList.Node middle  =head;
 int length=0;
 while(current.next()!=null){
length++;
if(length%2==0){
    middle=middle.next();
}
current = current.next();
}

System.out.println("Length of List "+length);
System.out.println("middle element of List "+middle);
}

}

class LinkedList{
    private Node head;
    private Node tail;
 
    public LinkedList(){
        this.head = new Node("head");
        tail = head;
    }
 
    public Node head(){
        return head;
    }
 
    public void add(Node node){
        tail.next = node;
        tail = node;
    }
 
    public static class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }
     
        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
     
        public String toString(){
            return this.data;
        }
    }
}


