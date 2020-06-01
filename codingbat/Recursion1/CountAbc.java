package com.codingbat.Recursion1;

public class CountAbc {

/*

Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
countAbc("ababc") → 2
countAbc("abxbc") → 0
countAbc("aaabc") → 1
countAbc("hello") → 0
countAbc("") → 0	0
countAbc("ab") → 0	0
countAbc("aba") → 1	1
countAbc("aca") → 0	0
countAbc("aaa") → 0	0

*/

    public int countAbc(String str) {

        if (str.length() <= 2) return 0;

        String check1 = "abc";
        String check2 = "aba";

        if (checkInString(str, check1, check2)) {
            return 1 + countAbc(str.substring(1));
        }
        return countAbc(str.substring(1));
    }

    public boolean checkInString(String str, String check1, String check2) {
        return (str.substring(0, check1.length()).equals(check1) || str.substring(0, check2.length()).equals(check2));
    }
}
