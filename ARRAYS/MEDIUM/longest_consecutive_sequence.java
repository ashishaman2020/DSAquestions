package ARRAYS.MEDIUM;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class longest_consecutive_sequence {
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};

        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
    public static int longestSuccessiveElements(int []arr){
        int n = arr.length;
        if(n == 0){
            return 0;
        }
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int it : set){
            if(!set.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x + 1)){
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}