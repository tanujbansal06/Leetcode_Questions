//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LeetCode_1290 {
    public int getDecimalValue(ListNode head) {
        int n = 0;
        while(head!=null){
            n = n*2 + head.val;
            head = head.next;
        }
        return n;
    }

    //main function
    // public static void main(String[] args) {
    //     ListNode head = new ListNode(1);
    //     head.next = new ListNode(0);
    //     head.next.next = new ListNode(1);
    //     LeetCode_1290 obj = new LeetCode_1290();
    //     int ans = obj.getDecimalValue(head);
    //     System.out.println(ans);
    // }
}