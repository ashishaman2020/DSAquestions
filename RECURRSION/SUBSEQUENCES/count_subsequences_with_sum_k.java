package RECURRSION.SUBSEQUENCES;

import java.util.ArrayList;

public class count_subsequences_with_sum_k {
    public static void main(String[] args) {
        int []arr = {1,2,1};
        int n = arr.length;
        int reqSum = 2;
        System.out.println(count(0,0, reqSum, arr, n));
    }

    public static int count(int idx, int s, int reqSum, int[] arr, int n){
        if(idx == n){
            if(s == reqSum){
                return 1;
            }
            return 0;
        }
        s+=arr[idx];
        int l = count(idx + 1, s, reqSum, arr, n);
        s-=arr[idx];
        int r = count(idx + 1, s, reqSum, arr, n);
        return l+r;
    }
}
