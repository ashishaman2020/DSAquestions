package prioityQueues;

// task is to replace each element of the array by its rank in the array
//  rank of an element is defined as the distance between the element with the first element of the array
// when the array is arranged in ascending order

import java.util.*;

public class replace_element_by_rank {
    public static void main(String[] args) {
//        int []arr = {20,15,26,2,98,6};
        int []arr = {2, 20, 10, 3, 14, 16, 14};
        int n = arr.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i : arr) {
            pq.offer(i);
        }

        HashMap<Integer, Integer> mpp = new HashMap<>();
        int cnt = 1;
        while (!pq.isEmpty()) {
            int num = pq.poll();
            if(!mpp.containsKey(num)) {
                mpp.put(num, cnt);
                cnt++;
            }
        }

        for(int i=0;i<n;i++) {
            arr[i] = mpp.get(arr[i]);
        }


//        Print the array.
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
