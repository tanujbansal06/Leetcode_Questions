
/*head hamesha 1st node pe point karega */
class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void addEnd(int val) {
        if (head == null) {
            Node n = new Node(val); // node banaya and using constructor value insert krdi
            head = n;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            Node n = new Node(val);
            ptr.next = n;
        }
    }

    public void addStart(int val) {
        Node n = new Node(val); // naya node banaya
        if (this.head == null) {
            head = n;
        } else {
            n.next = head; // newnode k next m head ko store
            head = n; // head ko n par shift kar diya
        }
    }

    public boolean find(int target) {
        if (this.head == null) {
            return false;
        } else {
            Node ptr = this.head;
            while (ptr != null) {
                if (ptr.data == target) {
                    return true;
                }
                ptr = ptr.next;
            }
        }
        return false;
    }

    public void print() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " -> ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public int countNodes() {
        int c = 0;
        Node ptr = this.head;
        while (ptr != null) {
            c++;
            ptr = ptr.next;
        }
        return c;
    }

    public Node mid() {
        int size = this.countNodes();
        Node ptr = this.head;
        int count = 0;
        if (size == 0)
            return null;
        while (ptr != null && count < (size / 2)) {
            count++;
            ptr = ptr.next;
        }
        return ptr;
    }

    public Node findMid() {
        if (head == null)
            return null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; 
    }
     
    public boolean compare(LinkedList l2){
	Node p1 = head;
    	Node p2 = l2.head;
	while(p1!=null && p2!=null){
		if(p1.data != p2.data){
			return false;
		}
	}
	p1 = p1.next;
	p2 = p2.next;
	if(p1==null && p2==null) return true;
	return false;

    }



}