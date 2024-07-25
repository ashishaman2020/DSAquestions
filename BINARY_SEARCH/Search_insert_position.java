package BINARY_SEARCH;

public class Search_insert_position {

    public static int insertSearch(int[] arr, int n, int x) {
        int low=0, high=n-1;
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
        int x = 5;
        System.out.println("Value should be inserted at the position : " + insertSearch(arr, n, x));
    }
}
