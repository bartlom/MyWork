package com.codingbat.Functional2;

/*

Given a list of strings,
return a list of the strings,
omitting any string length 4 or more.

noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → []
noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → []
noLong([]) → []
noLong([""]) → [""]
noLong(["empty", "", "empty"]) → [""]
noLong(["a"]) → ["a"]
noLong(["aaaa", "bbb", "***", "333"]) → ["bbb", "***", "333"]

*/

import java.util.List;

public class NoLong {

    public List<String> noLong(List<String> strings) {
        strings.removeIf(n -> n.length() > 3);
        return strings;
    }
}
