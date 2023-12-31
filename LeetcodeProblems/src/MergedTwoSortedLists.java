import java.util.List;

public class MergedTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode curr = head;

        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else{
                curr.next= list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if(list1==null){
            curr.next  = list2;
        }
        if(list2 ==null){
            curr.next = list1;
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node4.next = node5;
        node5.next = node6;

        mergeTwoLists(new ListNode(2),new ListNode(1));
    }
}
