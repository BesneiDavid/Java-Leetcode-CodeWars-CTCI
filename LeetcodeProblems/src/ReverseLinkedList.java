class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode reversedList = null;

        while(head != null){
                ListNode node = new ListNode(head.val);
                node.next = reversedList;
                head=head.next;
                reversedList=node;
        }
    return reversedList;
    }

    public static ListNode reverseList2(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while(current != null){
            ListNode next = current.next;
            current.next = previous;
            previous=current;
            current=next;
        }
        return previous;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        reverseList2(node1);
    }
}
