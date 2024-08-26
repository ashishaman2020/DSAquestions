package Strings;

public class Remove_outermost_paranthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeParanthesis(s));
    }
    public static String removeParanthesis(String s) {
        String str = "";
        int cnt = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(') {
                cnt++;
            }
            if(cnt > 1) {
                str += s.charAt(i);
            }
            if(s.charAt(i) == ')') {
                cnt--;
            }
        }
        return str;
    }
}