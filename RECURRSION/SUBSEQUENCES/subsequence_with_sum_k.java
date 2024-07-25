package RECURRSION.SUBSEQUENCES;

import java.util.ArrayList;

public class subsequence_with_sum_k {
    public static void main(String[] args) {
        int []arr = {1,2,1};
        int n = arr.length;
        int reqSum = 2;
        ArrayList<Integer> ds = new ArrayList<>();
        func(0, ds, 0, reqSum, arr, n);
    }
    public static void func(int idx, ArrayList<Integer> ds, int s, int reqSum, int[] arr, int n){
        if(idx == n){
            if(s == reqSum){
                for(int i : ds){
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            return;
        }
        s+=arr[idx];
        ds.add(arr[idx]);
        func(idx+1, ds, s, reqSum, arr, n);
        ds.remove(ds.size()-1);
        s-=arr[idx];
        func(idx+1, ds, s, reqSum, arr, n);
    }
}
