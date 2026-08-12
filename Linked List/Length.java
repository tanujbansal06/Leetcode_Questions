class Node{
  int data;
  Node next;
  public Node(int val){
    this.data = val;
  }
}
public class Length {
  public static void main(String[] args) {
    Node n = new Node(10);  
    Node n1 = new Node(20);  
    Node n2 = new Node(30);
    Node n3 = new Node(40);
    n.next = n1;
    n1.next = n2; 
    n2.next = n3;
    n1= null;
    n2 = null;
    n3 = null;

    int c =0;
    Node ptr = n;
    
    while(ptr != null){
      c++;
      ptr = ptr.next;
    }
    System.out.println(c);

    
  }
}