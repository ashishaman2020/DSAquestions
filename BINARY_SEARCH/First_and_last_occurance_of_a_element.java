package BINARY_SEARCH;

public class First_and_last_occurance_of_a_element {

    public static int first(int[] arr, int n, int x) {
        int low = 0, high = n-1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == x) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] >= x) {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int Last(int[] arr, int n ,int x) {
        int low=0, high = n-1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                ans = mid;
                low = mid + 1;
            }
            else if(arr[mid] <= x) {
                low = low + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,8,11,13};
        int n = arr.length;
        int x = 8;
        System.out.println(first(arr, n, x) + " " + Last(arr, n, x));
    }
}
