package com.codingbat.Map1;

import java.util.Map;

public class MapAB4 {
    /*
    Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value.
    If the values exist and have the same length, change them both to the empty string in the map.

mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}

     */
    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && (map.get("a").length() != map.get("b").length()))
            map.put("c", bigger(map));
        else if (map.containsKey("a") && map.containsKey("b")) {
            map.put("a", "");
            map.put("b", "");
        }
        return map;
    }

    public static String bigger(Map<String, String> map) {
        String result = "";
        if (map.get("a").length() > map.get("b").length()) result = map.get("a");
        else result = map.get("b");
        return result;
    }
}
