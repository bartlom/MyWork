package com.codingbat.Recursion1;

public class CountX {

/*

Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
countX("h") → 0
countX("x") → 1
countX("") → 0
countX("hihi") → 0
countX("hiAAhi12hi") → 0

*/

    public int countX(String str) {

        char search = 'x';

        if (str.length() <= 1) {
            if (str.length() > 0) {
                return searchChar(str, search);
            }
            return 0;
        }

        return searchChar(str, search) + countX(str.substring(1));
    }


    public static int searchChar(String str, char search) {
        if (str.charAt(0) == search) {
            return 1;
        }
        return 0;
    }
}
