class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }

    // Node(int val){
    // data = val;
    // }
}

class Doubly {
    Node head;

    public void addLast(int val) {
        Node n = new Node(val);
        if (head == null) {
            head = n;
            //return;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = n;
            n.prev = ptr;
        }

    }

    public void addFirst(int val) {
        if (head == null) {
            Node n = new Node(val);
            head = n;
        } else {
            Node n = new Node(val);
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    public void print() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print("<--" + ptr.data + "--> ");
            ptr = ptr.next;
        }
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("Empty h ll");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        head = head.next;
        if(head!=null){
            head.prev = null;
        }
    }

    public void deleteLast(){
        if(head.next == null){
            head = null;
            return;
        }
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node ptr = head;
        while(ptr.next.next!=null){
            ptr = ptr.next;
        }
        ptr.next = null;
    
    }

    public void insert(int data, int pos){
        Node n = new Node(data);
        if(head==null){
            head = n;
            return;
        }
        if(pos==1){
            n.next=head;
            head.prev =n;
            head =n;
            return;
        }
        Node ptr = head;
        for(int i =1;i<pos-1 && ptr!=null;i++){
            ptr = ptr.next;
        }
        if(ptr.next==null){
            ptr.next = n;
            n.prev = ptr;
            return;
        }

        Node temp = ptr.next;
        ptr.next = n;
        n.prev = ptr;
        temp.prev = n;
        n.next = temp;
    }
}

public class Doublyll {
    public static void main(String[] args) {
        Doubly d = new Doubly();
        d.addLast(10);
        d.addLast(20);
        d.addLast(30);
        d.addLast(50);
        d.insert(40,4);
        //d.addFirst(10);
        d.print();
    }
}
