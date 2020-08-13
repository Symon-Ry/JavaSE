package com.atguigu.letcode;

import org.junit.Test;

/**
 * @author Symon
 * @version 1.0
 * @className Solution
 * @description TODO
 * @date 2020/8/10 10:00
 */
public class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        StringBuffer res = new StringBuffer();
        String str = countAndSay(n - 1);
        int a = 0;
        for (int i = 1; i <= str.length(); i++) {
            if (i == str.length()) {
                return res.append(i - a).append(str.charAt(a)).toString();
            } else if (str.charAt(i) != str.charAt(a) ) {
                res.append(i - a).append(str.charAt(a));
                a = i;
            }
        }
        return res.toString();
    }
    @Test
    public void test() {
        System.out.println(countAndSay(40));
    }
}
