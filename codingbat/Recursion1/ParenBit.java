package com.codingbat.Recursion1;

public class ParenBit {

/*
Given a string that contains a single pair of parenthesis,
compute recursively a new string made of only of the parenthesis
and their contents, so "xyz(abc)123" yields "(abc)".

parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
parenBit("not really (possible)") → "(possible)"
parenBit("(abc)") → "(abc)"
parenBit("(abc)xyz") → "(abc)"
parenBit("(abc)x") → "(abc)"
parenBit("(x)") → "(x)"
parenBit("()") → "()"
parenBit("res (ipsa) loquitor") → "(ipsa)"
parenBit("hello(not really)there") → "(not really)"
parenBit("ab(ab)ab") → "(ab)"

*/

    public String parenBit(String str) {

        char searchStart = '(';
        char searchEnd = ')';

        if (startStringSearchChar(str, searchStart) && endStringSearchChar(str, searchEnd)) {
            return str;
        }

        if (startStringSearchChar(str, searchStart)) {
            return parenBit(str.substring(0, str.length() - 1));
        } else if (endStringSearchChar(str, searchEnd)) {
            return parenBit(str.substring(1));
        }

        return parenBit(str.substring(1, str.length() - 1));
    }

    public boolean startStringSearchChar(String str, char searchStart) {
        return (str.charAt(0) == searchStart);
    }

    public boolean endStringSearchChar(String str, char searchEnd) {
        return (str.charAt(str.length() - 1) == searchEnd);
    }
}
