import java.util.HashMap;

public class LinkedListCycle {

//    Time complexity: O(n+c) where n is the number of the nodes in the linked-list and is because we are checking
//    if the map contains that key
//    Space complexity O(n) where n is the number of the nodes in the linked list
    public static boolean hasCycle(ListNode head) {
        HashMap<Integer,ListNode> map = new HashMap<>();

        while(head != null){
            if(head.next != null && map.containsKey(head.next.val)){
                if(head.next == map.get(head.next.val)){
                return true;
                }
            }
            map.put(head.val,head);
            head = head.next;
        }
        return false;
    }

//    Time complexity O(n/2) we're skipping through the linked list
//    Space complexity O(1) because we're using some nodes.
    public static boolean hasCycle2(ListNode head) {
        ListNode fast = head;
        ListNode slow =head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = createLinkedListWithoutCycle();

        System.out.println( hasCycle2(head));
    }

    public static ListNode createLinkedListWithoutCycle() {
        int[] values = {-21, 10, 17, 8, 4, 26, 5, 35, 33, -7, -16, 27, -12, 6, 29, -12, 5, 9, 20, 14, 14, 2, 13, -24, 21, 23, -21, 5};

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }
}

