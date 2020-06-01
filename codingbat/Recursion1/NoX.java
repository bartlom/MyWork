package com.codingbat.Recursion1;

public class NoX {

/*

Given a string, compute recursively a new string where all the 'x' chars have been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""

*/

    public String noX(String str) {
        char check = 'x';
        if (str.length() <= 1) {
            if (str.length() > 0 && str.charAt(0) == check) return "";
            else return str;
        }

        return checkChar(str, check) + noX(str.substring(1));


    }

    public String checkChar(String str, char check) {
        if (str.charAt(0) == check) return "";
        else return String.valueOf(str.charAt(0));
    }
}
