package com.codingbat.Functional1;

import java.util.List;

/*

Given a list of strings, return a list
where each string has all its "x" removed.

noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]

*/

public class NoX {

    public List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replaceAll("n", ""));
        return strings;
    }
}
