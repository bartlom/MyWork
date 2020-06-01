package com.codingbat.Recursion1;

public class NestParen {


/*

Given a string, return true if it is a nesting of zero or more pairs of parenthesis,
like "(())" or "((()))".
Suggestion: check the first and last chars, and then recur on what's inside them.

nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false
nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false
nestParen("((())") → false
nestParen("((()()") → false
nestParen("()") → true
nestParen("") → true
nestParen("(yy)") → false
nestParen("(())") → true
nestParen("(((y))") → false
nestParen("((y)))") → false
nestParen("((()))") → true
nestParen("(())))") → false
nestParen("((yy())))") → false
nestParen("(((())))") → true

*/

    public boolean nestParen(String str) {

        if (str.length() == 0) return true;

        char searchStart = '(';
        char searchEnd = ')';

        if (startStringSearchChar(str, searchStart) && endStringSearchChar(str, searchEnd)) {
            return nestParen(str.substring(1, str.length() - 1));
        }

        return false;
    }

    public boolean startStringSearchChar(String str, char searchStart) {
        return (str.charAt(0) == searchStart);
    }

    public boolean endStringSearchChar(String str, char searchEnd) {
        return (str.charAt(str.length() - 1) == searchEnd);
    }
}