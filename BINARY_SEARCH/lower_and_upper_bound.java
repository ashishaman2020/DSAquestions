package BINARY_SEARCH;

public class lower_and_upper_bound {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,7,8,9,9,9,11};
        int n = arr.length;
        int x = 4;
//        System.out.println("Lower bound of x is : " + lower_bound(arr, n, x));
        System.out.println("Upper bound of x is : " +upper_bound(arr, n, x));
    }

    public static int upper_bound(int[] arr, int n, int x){
        int low = 0, high = n-1;
        int ans = n;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] > x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }return ans;
    }

    public static int lower_bound(int[] arr, int n, int x){
        int low = 0, high = n-1;
        int ans = n;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
