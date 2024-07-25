package ARRAYS.MEDIUM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(new Integer[]{2,1,5,4,3,0,0});
        List<Integer> ans = permutation(arr);
        System.out.print("The next permutation is : [");
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");
    }

    public static List<Integer> permutation(List<Integer> arr){
        int n = arr.size();
        int idx = -1;
        for(int i=n-2;i>=0;i--){
            if(arr.get(i) < arr.get(i + 1)){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            Collections.reverse(arr);
            return arr;
        }

//        Step2 : Find the smallest number greater than arr[idx] and swap both the numbers.
        for(int i=n-1;i>=0;i--){
            if(arr.get(i) > arr.get(idx)){
                int temp = arr.get(i);
                arr.set(i, arr.get(idx));
                arr.set(idx, temp);
                break;
            }
        }

//        Now that the numbers are swapped, reverse the subarray after the idx.
        List<Integer> sublist = arr.subList(idx + 1, n);
        Collections.reverse(sublist);
        return arr;
    }
}
