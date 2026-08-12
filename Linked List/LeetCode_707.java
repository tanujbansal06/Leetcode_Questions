class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LeetCode_707 {
    Node head;
    public LeetCode_707() {
        head =null;
    }
    
    public int get(int index) {
        Node ptr = head;
        for(int i=0;i<index;i++){
            if(ptr == null) return -1;
            ptr = ptr.next;
        }
        if(ptr == null) return -1;
        return ptr.data;
    }
    
    public void addAtHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }
    
    public void addAtTail(int val) {
        Node n = new Node(val);
        if(head == null){
            head =n;
            return;
        }
        Node ptr = head;
        while(ptr.next!=null){
            ptr = ptr.next;
        }
        ptr.next =n;

    }

    public void addAtIndex(int index, int val) {
        if(index==0){
            addAtHead(val);
            return;
        }
        Node ptr = head;
        for(int i =0;i<index-1 && ptr!=null;i++){
            ptr = ptr.next;
        }
        if(ptr==null) return;
        Node n = new Node(val);
        n.next =ptr.next;;
        ptr.next = n;
    }
    
    public void deleteAtIndex(int index) {
        if(index==0){
            if(head!=null){
                head = head.next;
            }
            return;
        }
        Node ptr = head;
        for(int i =0;i<index-1 && ptr!=null;i++){
            ptr = ptr.next;
        }
        if(ptr == null || ptr.next == null) return;
        ptr.next = ptr.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */