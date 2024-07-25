package RECURRSION.SUBSEQUENCES;

import java.util.ArrayList;

public class subsetSum {

    public static void ssum(int idx, int sum, int[] arr, int n, ArrayList<Integer> sumsubset){
        if(idx == n) {
            sumsubset.add(sum);
            return;
        }
//        Take
        ssum(idx+1, sum+=arr[idx], arr, n, sumsubset);
//        Not take
        sum -= arr[idx];
        ssum(idx+1, sum, arr, n, sumsubset);
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        int n = arr.length;
        ArrayList<Integer> sumsubset = new ArrayList<>();
        ssum(0,0,arr, n, sumsubset);
        System.out.println(sumsubset.toString());
    }
}
