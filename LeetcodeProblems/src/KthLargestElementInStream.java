import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class KthLargest {
//    My First Solution very bad
    /*
    private ArrayList<Integer> list=new ArrayList<>();
    private int kthElement;

    public  KthLargest(int k, int[] nums) {
        this.kthElement=k;
        Arrays.sort(nums);
        for(int num:nums){
            this.list.add(num);
        }
    }

    public int add(int val) {
        this.list.add(val);
        this.list.sort(Comparator.naturalOrder());

        return this.list.get(this.list.size()-kthElement);
    }
     */

//    Solution using minHeap
    private PriorityQueue<Integer> minHeap;
    private int kthElement;

    public  KthLargest(int k, int[] nums) {
        this.kthElement=k;
        this.minHeap= new PriorityQueue<>(k);
        for(int number:nums){
            add(number);
        }
    }

    public int add(int val) {
        if(this.minHeap.size() < this.kthElement ){
            this.minHeap.offer(val);
        }else if(val > this.minHeap.peek()){
            this.minHeap.poll();
            this.minHeap.offer(val);
        }

        return this.minHeap.peek();
    }

    public static void main(String[] args){
        int[] nums = {};
        KthLargest obj = new KthLargest(1, nums);
        int param_1=obj.add(-3);
        int param_2=obj.add(-2);
        int param_3=obj.add(-4);
        int param_4=obj.add(0);
        int param_5=obj.add(4);
    }
}
