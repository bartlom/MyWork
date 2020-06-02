package com.codingbat.Recursion1;

public class StrDist {

/*

Given a string and a non-empty substring sub,
compute recursively the largest substring which starts
and ends with sub and return its length.

strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
strDist("abccatcowcatcatxyz", "cat") → 12
strDist("xyx", "x") → 3
strDist("xyx", "y") → 1
strDist("xyx", "z") → 0
strDist("z", "z") → 1
strDist("x", "z") → 0
strDist("", "z") → 0
strDist("hiHellohihihi", "hi") → 13
strDist("hiHellohihihi", "hih") → 5
strDist("hiHellohihihi", "o") → 1
strDist("hiHellohihihi", "ll") → 2

*/

    public int strDist(String str, String sub) {

        if (str.length() < sub.length()) {
            return 0;
        }

        if (startStringSearchString(str, sub) && endStringSearchString(str, sub)) {
            return str.length();
        }

        if (notOutOfBoundsExceptionTwoChars(str, sub) && !startStringSearchString(str, sub) && !endStringSearchString(str, sub)) {
            return strDist(str.substring(1, str.length() - 1), sub);
        }

        if (startStringSearchString(str, sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        }

        return strDist(str.substring(1), sub);

    }

    public boolean startStringSearchString(String str, String sub) {
        return (str.substring(0, sub.length()).equals(sub));
    }

    public boolean endStringSearchString(String str, String sub) {
        return (str.substring(str.length() - sub.length(), str.length()).equals(sub));
    }

    public boolean notOutOfBoundsException(String str, String sub) {
        return (str.length() >= sub.length());
    }

    public boolean notOutOfBoundsExceptionTwoChars(String str, String sub) {
        return (str.length() >= 2);
    }
}
