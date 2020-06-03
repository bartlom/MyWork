package com.codingbat.Ap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordsWithoutList {

/*

Given an array of strings, return a new List (e.g. an ArrayList)
where all the strings of the given length are omitted.
See wordsWithout() below which is more difficult because it uses arrays.

wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
wordsWithoutList(["xx", "yyy", "x", "yy", "z"], 1) → ["xx", "yyy", "yy"]
wordsWithoutList(["xx", "yyy", "x", "yy", "z"], 2) → ["yyy", "x", "z"]

*/

    public static String[] words = new String[]{"a", "bb", "b", "ccc"};
    public static String target = "1";

    public List wordsWithoutList(String[] words, int len) {
        List<String> lista1 = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) lista1.add(words[i]);
        }
        return lista1;
    }

    public List wordsWithoutList2(String[] words, int len) {
        return Arrays.stream(words)
                .filter(n -> n.length() != len)
                .collect(Collectors.toList());
    }
}
