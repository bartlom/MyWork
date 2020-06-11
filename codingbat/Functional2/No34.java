package com.codingbat.Functional2;

/*

Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

no34(["a", "bb", "ccc"]) → ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
no34(["ccc", "dddd", "apple"]) → ["apple"]
no34(["a", "bb", "ccc"]) → ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
no34(["ccc", "dddd", "apple"]) → ["apple"]
no34(["this", "not", "too", "long"]) → []
no34(["a", "bbb", "cccc", "xx"]) → ["a", "xx"]
no34(["dddd", "ddd", "xxxxxxx"]) → ["xxxxxxx"]
no34([]) → []
no34([""]) → [""]
no34(["empty", "", "empty"]) → ["empty", "", "empty"]
no34(["a"]) → ["a"]
no34(["aaaa", "bbb", "*****", "333"]) → ["*****"]

 */

import java.util.List;

public class No34 {

    public List<String> no34(List<String> strings) {
        strings.removeIf(n -> n.length() == 3 || n.length() == 4);
        return strings;
    }
}
