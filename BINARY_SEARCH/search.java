package BINARY_SEARCH;

public class search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int target = 4;
//        System.out.println("Element found at index : " + find(arr, n, target));
        System.out.println("Element found at index by using recurrsion is : " + findrecurr(arr, 0, n-1, target));
    }

    public static int findrecurr(int[] arr, int low, int high, int target) {
        if(low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target){
            return findrecurr(arr, low, mid-1, target);
        }
        return findrecurr(arr, mid + 1, high, target);
    }

    public static int find(int[] arr, int n, int target){
        int low=0, high = n-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
