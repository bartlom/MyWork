package com.codingbat.Recursion1;

public class StrCount {

/*

Given a string and a non-empty substring sub, compute recursively
the number of times that sub appears in the string,
without the sub strings overlapping.

strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0
strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0
strCount("cacatcowcat", "cat") → 2
strCount("xyx", "x") → 2
strCount("iiiijj", "i") → 4
strCount("iiiijj", "ii") → 2
strCount("iiiijj", "iii") → 1
strCount("iiiijj", "j") → 2
strCount("iiiijj", "jj") → 1
strCount("aaabababab", "ab") → 4
strCount("aaabababab", "aa") → 1
strCount("aaabababab", "a") → 6
strCount("aaabababab", "b") → 4

*/

    public int strCount(String str, String sub) {

        if (str.length() < sub.length()) {
            return 0;
        }

        if (checkStringIsInString(str, sub)) {
            return 1 + strCount(str.substring(sub.length()), sub);
        }

        return strCount(str.substring(1), sub);
    }

    public boolean checkStringIsInString(String str, String check) {
        return (str.substring(0, check.length()).equals(check));
    }

    public boolean notOutOfBoundsException(String str, String check) {
        return (str.length() >= check.length());
    }


}
