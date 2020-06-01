package com.codingbat.Recursion1;

public class StringClean {

/*

Given a string, return recursively a "cleaned" string
where adjacent chars that are the same have been reduced
to a single char. So "yyzzza" yields "yza".

stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"

*/

    public String stringClean(String str) {

        if (str.length() <= 1) return str;

        if (checkIsTwoSameChars(str)) return stringClean(str.substring(1));
        return str.charAt(0) + stringClean(str.substring(1));
    }

    public boolean checkIsTwoSameChars(String str) {
        return (str.charAt(0) == str.charAt(1));
    }
}