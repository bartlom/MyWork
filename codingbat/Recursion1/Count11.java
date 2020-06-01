package com.codingbat.Recursion1;

public class Count11 {


/*

Given a string, compute recursively (no loops) the number of "11"
substrings in the string. The "11" substrings should not overlap.

count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1
count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1
count11("1111") → 2
count11("1") → 0
count11("") → 0
count11("hi") → 0
count11("11x111x1111") → 4
count11("1x111") → 1
count11("1Hello1") → 0
count11("Hello") → 0

*/

    public int count11(String str) {

        if (str.length() <= 1) return 0;

        String check = "11";

        if (checkInt(str, check)) {
            return 1 + count11(str.substring(2));
        }
        return count11(str.substring(1));
    }

    public boolean checkInt(String str, String check) {
        return (str.substring(0, 2).equals(check));
    }
}
