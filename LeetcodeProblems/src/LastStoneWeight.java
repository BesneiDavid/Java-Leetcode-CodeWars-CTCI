import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
//    My solution
//    Time complexity: O(n*log n) this is the max time complexity although we have 2 loops the log part is coming from
//    inserting and removing elements from the priorityQueue
//    Space complexity: O(n) because we're using a heap to store all the stones from the array.

    public static int lastStoneWeight(int[] stones) {
        Comparator<Integer> comparator = Collections.reverseOrder();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(comparator);
        int x,y;

        for(int i=0;i<stones.length;i++){
            maxHeap.add(stones[i]);
        }

        while(maxHeap.size() >=2){
            x = maxHeap.poll();
            y=maxHeap.poll();

            if(x!=y){
                maxHeap.add(Math.abs(x-y));
            }
        }

        return maxHeap.size()!=0 ? maxHeap.peek():0 ;
    }

    public static void main(String[] args) {
        int[] array={1};
        System.out.println(lastStoneWeight(array));
    }
}
