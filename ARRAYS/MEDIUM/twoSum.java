package ARRAYS.MEDIUM;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
//        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        int[] nums = {2,7,11,15};
        int target = 9;
        int len = nums.length;

//        O(n2)
//        for(int i=0;i<len;i++){
//            for(int j=0;j<len;j++){
//                if(i == j){
//                    continue;
//                }
//                if(nums[i] + nums[j] > target){
//                    break;
//                }
//                if((nums[i] + nums[j]) == target){
//                    System.out.println(i + " " + j);
//                }
//            }
//        }

//        Get all the values in a map to get it it O(n).
//        Map<Integer, Integer> mpp = new HashMap<>();
//        int[] arr = new int[2];
//        for(int i=0;i<len;i++){
//            int num = nums[i];
//            int more = target - nums[i];
//            if(mpp.containsKey(more)){
//                arr[0] = i;
//                arr[1] = mpp.get(more);
//                break;
//            }
//            mpp.put(nums[i], i);
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }


//        Using two pointers to get the optimal solution (O(n)).
        Arrays.sort(nums);
        int left = 0, right = nums.length-1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                System.out.println(left + " " + right);
                break;
            }
            else if(sum < target)left++;
            else right--;
        }
    }
}
