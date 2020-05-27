package com.codingbat.Map2;

import java.util.HashMap;
import java.util.Map;

public class allSwap {

/*

We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
Loop over and then return the given array of non-empty strings as follows:
if a string matches an earlier string in the array, swap the 2 strings in the array.
When a position in the array has been swapped, it no longer matches anything.
Using a map, this can be solved making just one pass over the array. More difficult than it looks.

allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]

*/

    public String[] allSwap(String[] strings) {
        String[] result = new String[strings.length];
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i].substring(0, 1)) && map.get(strings[i].substring(0, 1)) < strings.length) {
                result[map.get(strings[i].substring(0, 1))] = strings[i];
                result[i] = strings[map.get(strings[i].substring(0, 1))];
                map.put(strings[i].substring(0, 1), strings.length);
            } else if (!map.containsKey(strings[i].substring(0, 1))) {
                map.put(strings[i].substring(0, 1), i);
                result[i] = strings[i];
            } else result[i] = strings[i];
        }
        return result;
    }
}
