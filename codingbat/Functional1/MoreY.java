package com.codingbat.Functional1;

/*

Given a list of strings, return a list where
each string has "y" added at its start and end.

moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]
moreY(["", "a", "xx"]) → ["yy", "yay", "yxxy"]
moreY([]) → []
moreY(["xx", "yy", "zz"]) → ["yxxy", "yyyy", "yzzy"]

 */

import java.util.List;

public class MoreY {

    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n -> "y" + n + "y");
        return strings;
    }
}
