package BINARY_SEARCH;

public class Floor_and_ceil {

    public static int ceil(int[] arr, int n, int x) {
        int low=0, high=n-1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int floor(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,8,11,13};
        int n = arr.length;
        int x = 3;
//        System.out.println(floor(arr, n, x));
        System.out.println(ceil(arr, n, x));
    }
}
