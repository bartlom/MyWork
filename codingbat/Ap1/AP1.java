package com.codingbat.Ap1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AP1 {

/*
Given an array of strings, return a new array containing the first N strings.
N will be in the range 1..length.

wordsFront(["a", "b", "c", "d"], 1) → ["a"]
wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
wordsFront(["a", "b", "c", "d"], 4) → ["a", "b", "c", "d"]
wordsFront(["Hi", "There"], 1) → ["Hi"]
wordsFront(["Hi", "There"], 2) → ["Hi", "There"]

*/

    public String[] wordsFront(String[] words, int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = words[i];
        }
        return result;
    }

    public String[] wordFront2(String[] words, int n) {
        return Arrays.stream(words)
                .limit(n)
                .toArray(String[]::new);
    }
}


