import tanuj.bansal.LinkedList;

public class xyz {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addEnd(10);
        l1.addEnd(20);
        LinkedList l2 = new LinkedList();
        l2.addEnd(10);
        l2.addEnd(20);
        System.out.println(l1.equals(l2));

    }
}
