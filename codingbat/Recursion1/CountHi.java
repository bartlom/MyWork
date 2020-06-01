package com.codingbat.Recursion1;

public class CountHi {

/*

Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
countHi("hihih") → 2
countHi("h") → 0
countHi("") → 0
countHi("ihihihihih") → 4
countHi("ihihihihihi") → 5
countHi("hiAAhi12hi") → 3
countHi("xhixhxihihhhih") → 3
countHi("ship") → 1

*/

    public int countHi(String str) {

        if (str.length() <= 1) {
            return 0;
        }

        String hi = "hi";

        return checkChar(str, hi) + countHi(str.substring(1));
    }

    public int checkChar(String str, String hi) {
        if (str.substring(0, hi.length()).equals(hi)) {
            return 1;
        }
        return 0;
    }
}
