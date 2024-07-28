package GreedyAlgorithms;

//Given two arrays representing children’s green factor and cookie sizes, the goal is to maximise the number of content children.
//Each child i has a greed factor of g[i], which is the minimum size of a cookie that will make the child content. Each cookie j has a size of s[j]. If s[j] >= g[j], we can assign cookie j to child i, making the child content. Each child can only receive one cookie.

import java.util.Arrays;

public class AssignCookies {

    private static int findChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt = 0;
        int i=0,j=0;
        while (i < g.length && j < s.length) {
            if(g[i] <= s[j]) {
                cnt++;
                i++;
                j++;
            }else {
                j++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};

        System.out.println("The number of children that have access to cookies are : ");
        System.out.println(findChildren(g,s));
    }
}
