package com.codingbat.Recursion1;

public class AllStar {


/*

Given a string, compute recursively a new string
where all the adjacent chars are now separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
allStar("a") → "a"
allStar("") → ""
allStar("3.14") → "3*.*1*4"
allStar("Chocolate") → "C*h*o*c*o*l*a*t*e"
allStar("1234") → "1*2*3*4"

*/

    public String allStar(String str) {

        if (str.length() <= 1)
            return str;

        String add = "*";

        return addStringInString(str, add) + allStar(str.substring(1));
    }

    public static String addStringInString(String str, String add) {

        return str.charAt(0) + add;
    }
}
