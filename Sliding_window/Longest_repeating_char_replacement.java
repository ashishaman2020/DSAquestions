package Sliding_window;

import java.util.HashMap;

public class Longest_repeating_char_replacement {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        int n = s.length();

        int l=0, r=0, maxlen=0, maxfrq=0;
        int[] arr = new int[26];
        while(r < n) {
            arr[s.charAt(r) - 'A']++;
            maxfrq = Math.max(maxfrq, arr[s.charAt(r)-'A']);
            while(r-l+1-maxfrq > k) {
                arr[s.charAt(l)-'A']--;
                maxfrq=0;
                for(int i=0;i<26;i++) {
                    maxfrq = Math.max(maxfrq, arr[i]);
                }
                l++;
            }
            if((r-l+1)-maxfrq <= k) {
                maxlen = Math.max(maxlen, r-l+1);
            }
            r++;
        }
        System.out.println(maxlen);
    }
}
