package Stack_Medium;


public class MinStack2 {
    ListNode head;

    public MinStack2(){
        head=null;
    }

    public void push(int val) {
        if(head==null){
            head = new ListNode(val,val,null);
        } else {
            head = new ListNode(val,Math.min(head.min,val),head);
        }
    }

    public void pop(){
        head=head.next;
    }

    public int getMin(){
        return head.min;
    }

    public int top(){
        return head.val;
    }

    static class ListNode{
            int val;
            int min;
            ListNode next;

            public ListNode(int val,int min,ListNode node){
                this.min=min;
                this.val=val;
                this.next=node;
            }
        }
        public static void main(String[] args) {
            MinStack2 minStack = new MinStack2();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        System.out.println( minStack.getMin() );
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
