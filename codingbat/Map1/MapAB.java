package com.codingbat.Map1;

import java.util.Map;

public class MapAB {
    /*
    Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".

mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}	{"a": "Hi", "ab": "HiThere", "b": "There"}	OK
mapAB({"a": "Hi"}) → {"a": "Hi"}	{"a": "Hi"}	OK
mapAB({"b": "There"}) → {"b": "There"}	{"b": "There"}	OK
mapAB({"c": "meh"}) → {"c": "meh"}	{"c": "meh"}	OK
mapAB({"a": "aaa", "ab": "nope", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "ab": "aaabbb", "b": "bbb", "c": "ccc"}	{"a": "aaa", "ab": "aaabbb", "b": "bbb", "c": "ccc"}	OK
mapAB({"ab": "nope", "b": "bbb", "c": "ccc"}) → {"ab": "nope", "b": "bbb", "c": "ccc"}	{"ab": "nope", "b": "bbb", "c": "ccc"}

     */
    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }


}
