package com.codingbat.Ap1;

import java.util.ArrayList;
import java.util.List;

public class WordsWithout {



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
}
