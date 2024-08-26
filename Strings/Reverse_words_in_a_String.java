package Strings;

public class Reverse_words_in_a_String {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] arr = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--) {
            if(!arr[i].equals("")){
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString();
    }
}
