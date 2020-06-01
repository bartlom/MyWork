package com.codingbat.Recursion1;

public class EndX {

/*

Given a string, compute recursively a new string where all the
lowercase 'x' chars have been moved to the end of the string.

endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
endX("hiy") → "hiy"
endX("h") → "h"
endX("x") → "x"
endX("xx") → "xx"
endX("") → ""
endX("bxx") → "bxx"
endX("bxax") → "baxx"
endX("axaxax") → "aaaxxx"
endX("xxhxi") → "hixxx"

*/

    public String endX(String str) {

        if (str.length() <= 1)
            return str;

        char search = 'x';

        if (checkChar(str, search)) {
            return endX(str.substring(1)) + search;
        }
        return str.substring(0, 1) + endX(str.substring(1));
    }

    public static boolean checkChar(String str, char search) {
        return (str.charAt(0) == search);
    }
}
