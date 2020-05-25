package com.codingbat.Functional2;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    /*
    Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.

noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) → ["ay", "by"]
noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
     */

    public List<String> noYY(List<String> strings) {
        strings = (List<String>) strings.stream()
                .map(n -> n + "y")
                .filter(n -> n.contains("yy") == false)
                .collect(Collectors.toList());
        return strings;
    }
}
