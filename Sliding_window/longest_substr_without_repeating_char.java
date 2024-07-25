package Sliding_window;

import java.util.HashMap;

public class longest_substr_without_repeating_char {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int n = s.length();

        System.out.println(findmaxlen(s, n));
    }

    private static int findmaxlen(String s, int n) {
//        We have to store the values in the order of <char, index>.
        HashMap<Character, Integer> mpp = new HashMap<>();
        int r=0, l=0, maxlen=0;
        while (r < n) {
            if(mpp.containsKey(s.charAt(r))) {
                if(mpp.get(s.charAt(r)) >= l) {
                    l = mpp.get(s.charAt(r)) + 1;
                }
            }
            int len = r - l + 1;
            maxlen = Math.max(maxlen, len);
//            Insert the current index value in the hashmap
            mpp.put(s.charAt(r), r);
            r++;
        }
        return maxlen;
    }
}
