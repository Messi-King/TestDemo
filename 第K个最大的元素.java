//寻找第K大
import java.util.*;
public class Finder {
    public int findKth(int[] a, int n, int K) {
         PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
 
        for(int m : a){
            // 堆元素数量不够K个或者待入堆元素比堆顶元素大
            if(priorityQueue.size() < K || priorityQueue.peek() <= m){
                priorityQueue.offer(m);
            }
            // 保持堆大小为K
            if(priorityQueue.size() > K){
                priorityQueue.poll();
            }
        }
 
        return priorityQueue.peek();
    }
}