package ARRAYS.MEDIUM;

public class kadaneAlgo {
    public static void main(String[] args) {
//        This algorithm is used to find the max subarray sum in a array.
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }

    private static long maxSubarraySum(int[] arr, int n) {
        long maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum > maxsum){
                maxsum = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return maxsum;
    }
}
