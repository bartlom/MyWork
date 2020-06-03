package com.codingbat.Ap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsWithout {

/*

Given an array of strings, return a new array without the strings
that are equal to the target string.
One approach is to count the occurrences of the target string,
make a new array of the correct length, and then copy over the correct strings.

wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
wordsWithout(["b", "c", "a", "a"], "b") → ["c", "a", "a"]
wordsWithout(["xx", "yyy", "x", "yy", "x"], "x") → ["xx", "yyy", "yy"]
wordsWithout(["xx", "yyy", "x", "yy", "x"], "yy") → ["xx", "yyy", "x", "x"]
wordsWithout(["aa", "ab", "ac", "aa"], "aa") → ["ab", "ac"]

*/

    public static String[] words = new String[]{"a", "bb", "b", "ccc"};
    public static String target = "a";

    public static String[] wordsWithout(String[] words, String target) {
        List<String> lista1 = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i] != target) {
                lista1.add(words[i]);
            }
        }
        String[] result = new String[lista1.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = lista1.get(i);
        }
        return result;
    }

    public static String[] wordsWithout2(String[] words, String target) {
        return Arrays.stream(words)
                .filter(n -> n.equals(target) == false)
                .toArray(String[]::new);
    }
}