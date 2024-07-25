package ARRAYS.MEDIUM;

import java.util.ArrayList;
import java.util.Arrays;

public class sort012 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0,2,1,2,0,1));
        int n = arr.size();

        sortArr(arr, n);

        for(int i=0;i<n;i++){
            System.out.print(arr.get(i) + " ");
        }
    }
    public static void sortArr(ArrayList<Integer> arr, int n){
        int low=0, mid =0, high = n-1;
        while (mid <= high) {
            if(arr.get(mid) == 0){
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            }
            else if(arr.get(mid) == 1) {
                mid++;
            }
            else{
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }
}
