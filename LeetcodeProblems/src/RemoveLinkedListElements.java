public class RemoveLinkedListElements {
//    Time complexity O(n) we're traversing the linked list only once
//    Space complexity O(1) we're modifying the same linked list using the same nodes.
    public static  ListNode removeElements(ListNode head, int val) {
        ListNode root = null;
        ListNode nextNode=new ListNode();

        while(head!=null){
            if(head.val != val){
                if(root == null){
                    root=head;
                    nextNode=head;
                }
                else {
                    nextNode.next = head;
                    nextNode=  nextNode.next;
                }
            } else {
                nextNode.next =null;
            }
            head=head.next;
        }
        return root;
    }
// Nota personala ii foarte ok sa faci un node dummy si sa pornesti cu doua noduri din exact aceeasi pozitie.
    public static  ListNode removeElements2(ListNode head, int val) {
    ListNode dummy = new ListNode();
    ListNode current = dummy;

        while(head!=null){
           if(head.val!=val){
               current.next=head;
               current=current.next;
           }
            head=head.next;
        }
        current.next=null;

        return dummy.next;
    }

    public static ListNode arrayToList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] array = {6,6,3,6,2};
        ListNode head = arrayToList(array);
        removeElements2(head,6);
    }
}
