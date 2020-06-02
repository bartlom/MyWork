package com.codingbat.Recursion1;

public class StrCopies {

/*
Given a string and a non-empty substring sub,
compute recursively if at least n copies of sub appear in the string somewhere,
possibly with overlapping. N will be non-negative.

strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
strCopies("iiijjj", "i", 3) → true
strCopies("iiijjj", "i", 4) → false
strCopies("iiijjj", "ii", 2) → true
strCopies("iiijjj", "ii", 3) → false
strCopies("iiijjj", "x", 3) → false
strCopies("iiijjj", "x", 0) → true
strCopies("iiiiij", "iii", 3) → true
strCopies("iiiiij", "iii", 4) → false
strCopies("ijiiiiij", "iiii", 2) → true
strCopies("ijiiiiij", "iiii", 3) → false
strCopies("dogcatdogcat", "dog", 2) → true
*/

    public boolean strCopies(String str, String sub, int n) {

        if (n <= 0 || str.length() < sub.length()) {
            return (n <= 0);
        }

        if (checkStringIsInString(str, sub)) {
            return strCopies(str.substring(1), sub, n-1);
        }

        return strCopies(str.substring(1), sub, n);
    }

    public boolean checkStringIsInString(String str, String check) {
        return (str.substring(0, check.length()).equals(check));
    }
}