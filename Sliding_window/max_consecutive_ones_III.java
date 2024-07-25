package Sliding_window;

public class max_consecutive_ones_III {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;      // A max of 2 zeros can be converted.
        int n = nums.length;

        int l=0, r=0, maxlen=0;
        int cntzeros = 0;
        while (r < n){
            if(nums[r] == 0) {
                cntzeros++;
            }
            if(cntzeros > k) {
                if(nums[l] == 0) {
                    cntzeros--;
                }
                l++;
            }
            if(cntzeros <= k) {
                int len = r-l+1;
                maxlen = Math.max(maxlen, len);
            }
            r++;
        }


        System.out.println(maxlen);
    }
}
