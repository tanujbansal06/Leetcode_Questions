/*array mein problem kya h????
  1-fixed size and size can't be change during run time
  2-agr contigous array nhi hui toh array fail ho jaega....
    doesnot utilize memory properly ,,,, jagah toh hogi memory mein but contigous nhi hui toh array fail*/

/*array 0 se start kyu hota h??
 */

/*memory mein jha jagah mil jaye data store kra do and link kra do and hr data ko pta h ki next data kha h--->linked list 
node k pass data hota h and next (reference/address)*/

class Node{
    int data;
    Node next; //next ek reference variable (next node ka address store karega) h ;ye sirf node ko hi refer karega

    //jo class ka naam vhi constructor ka naam hota h and no return type
    // object ko initialise krna constructror ka kaam h
    Node(int val){
      data = val;
      next = null; // ye default bhi null hota h
    }

}

class Demo{
    public static void main(String[] args) {
      //Node n1 = new Node();  //ram mein random jagah pr node class ka object bn jata h jinko node hi khte h , yha n1 reference variable h..
      //Node n2 = new Node();  
      //Node n3 = new Node();

      //n1.data = 10; //node mein data fill krne k liye
      //n2.data = 20;
      //n3.data = 30;

      Node n1 = new Node(10);  // constructor
      Node n2 = new Node(20);  
      Node n3 = new Node(30);
      
      n1.next = n2; //link krne k liye n2 ko n1 se
      n2.next = n3;
      n3.next = null; //last node by default java mein null hota h but other language mein nhi hota vha khud likhna hota h

      /*n2 = null;
      n3 = null; */

      //printing
      Node p = n1; //p node 1 ko refer kr rha h yha p ref var h jo n1 ko point kr rha h
      while(p!=null){ //jb tk linked list khtm na ho jaye
        System.out.print(p.data+" "); //print kro
        p = p.next;  //next pr jao
      }

    }
}



