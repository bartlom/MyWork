package com.codingbat.Recursion1;

public class CountHi2 {


/*

Given a string, compute recursively the number of times lowercase "hi"
appears in the string, however do not count "hi"
that have an 'x' immedately before them.

countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
countHi2("hixhi") → 1
countHi2("hixhhi") → 2
countHi2("hihihi") → 3
countHi2("hihihix") → 3
countHi2("xhihihix") → 2
countHi2("xxhi") → 0
countHi2("hixxhi") → 1
countHi2("hi") → 1
countHi2("xxxx") → 0
countHi2("h") → 0
countHi2("x") → 0
countHi2("") → 0
countHi2("Hellohi") → 1

 */

    public int countHi2(String str) {

        if (str.length() <= 1)
            return 0;

        String search1 = "hi";
        String search2 = "xhi";

        if (checkStringIsInString(str, search1))
            return 1 + countHi2(str.substring(search1.length()));
        else if
        (notOutOfBoundsException(str, search2) && checkStringIsInString(str, search2))
            return countHi2(str.substring(search2.length()));

        return countHi2(str.substring(1));
    }

    public boolean checkStringIsInString(String str, String check) {
        return (str.substring(0, check.length()).equals(check));
    }

    public boolean notOutOfBoundsException(String str, String check) {
        return (str.length() >= check.length());
    }
}
