package com.codingbat.Map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {

/*

Loop over the given array of strings to build a result string like this:
when a string appears the 2nd, 4th, 6th, etc. time in the array,
append the string to the result. Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
wordAppend(["a", "b", "a"]) → "a"	"a"	OK
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"	"aa"	OK
wordAppend(["a", "", "a"]) → "a"	"a"	OK
wordAppend([]) → ""	""	OK
wordAppend(["a", "b", "b", "a", "a"]) → "ba"	"ba"	OK
wordAppend(["a", "b", "b", "b", "a", "c", "a", "a"]) → "baa"	"baa"	OK
wordAppend(["a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"]) → "baaba"	"baaba"	OK
wordAppend(["not", "and", "or", "and", "this", "and", "or", "that", "not"]) → "andornot"	"andornot"	OK
wordAppend(["a", "b", "c"]) → ""	""	OK
wordAppend(["this", "or", "that", "and", "this", "and", "that"]) → "thisandthat"	"thisandthat"	OK
wordAppend(["xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"]) → "xxyyzzxx"	"xxyyzzxx"

*/

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String result = "";
        for (String s : strings) {
            if (map.containsKey(s)) {
                result += s;
                map.remove(s);
            } else map.put(s, 1);
        }
        return result;
    }
}