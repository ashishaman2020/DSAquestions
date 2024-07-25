package ARRAYS.MEDIUM;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class length_of_subarray_with_sum_k {
    public static void main(String[] args) {
        int[] arr = {-1,1,1};
        int k = 1;
        int len = getLongestSubarray(arr, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

    public static int getLongestSubarray(int[] arr, int k){
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if (sum == k){
                maxLen = Math.max(maxLen, i + 1);
            }
            int rem = sum - k;
            if(mpp.containsKey(rem)){
                int len = i-mpp.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if(!mpp.containsKey(sum)){
                mpp.put(sum, i);
            }
        }
        return maxLen;
    }
}