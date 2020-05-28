package com.codingbat.Recursion1;

public class CountX {

/*

Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0

*/

    public int countX(String str) {

        char check = 'x';

        if (str.length() <= 1) {
            return checkCharOneChar(str, check);
        }
        return checkChar(str, check) + countX(str.substring(1));
    }


    public static int checkChar(String str, char check) {
        int result = 0;
        if (str.charAt(0) == check) {
            result++;
        }
        return result;
    }

    public static int checkCharOneChar(String str, char check) {
        int result = 0;
        if (str.length() > 0 && str.charAt(0) == check) {
            result++;
        }
        return result;
    }
}
