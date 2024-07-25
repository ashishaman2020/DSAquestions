package Sliding_window;

import java.util.HashMap;

public class cnt_max_fruits_in_basket {
    public static void main(String[] args) {

        int[] arr = {0,1,2,2,2,2};
        int n = arr.length;
        int k = 2;

        int l=0, r=0, maxlen=0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        while (r < n) {
            mpp.put(arr[r], mpp.getOrDefault(arr[r], 0) + 1);
             if(mpp.size() > k) {
                 while (mpp.size() > k) {
                     mpp.put(arr[l], mpp.get(arr[l]) - 1);
                     if (mpp.get(arr[l]) == 0) {
                         mpp.remove(arr[l]);
                     }
                     l++;
                 }
             }
             if(mpp.size() <= k) {
                 maxlen = Math.max(maxlen, r-l+1);
             }
             r++;
        }
        System.out.println(maxlen);
    }
}
