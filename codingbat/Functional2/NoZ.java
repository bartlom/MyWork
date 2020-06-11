package com.codingbat.Functional2;

/*
Given a list of strings, return a list of the strings,
omitting any string that contains a "z".
(Note: the str.contains(x) method returns a boolean)

noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
noZ([]) → []
noZ([""]) → [""]
noZ(["x", "y", "z"]) → ["x", "y"]

*/

import java.util.List;

public class NoZ n 

    public List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }
}
