package com.codingbat.Recursion1;

public class PairStar {

/*

Given a string, compute recursively a new string where identical
chars that are adjacent in the original string
are separated from each other by a "*".

pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"
pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"
pairStar("aaab") → "a*a*ab"
pairStar("aa") → "a*a"
pairStar("a") → "a"
pairStar("") → ""
pairStar("noadjacent") → "noadjacent"
pairStar("abba") → "ab*ba"
pairStar("abbba") → "ab*b*ba"

*/

    public String pairStar(String str) {

        if (str.length() <= 1) return str;

        String add = "*";

        return addStringInString(str, add) + pairStar(str.substring(1));
    }

    public static String addStringInString(String str, String add) {
        if (str.charAt(0) == str.charAt(1)) return (str.charAt(0) + add);
        else return String.valueOf(str.charAt(0));
    }


}
