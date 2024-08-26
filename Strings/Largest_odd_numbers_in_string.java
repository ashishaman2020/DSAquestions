package Strings;

public class Largest_odd_numbers_in_string {
    public static void main(String[] args) {
        String num = "52";
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {
        int n = num.length();
        for(int i=n-1;i>=0;i--) {
            if(num.charAt(i) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
