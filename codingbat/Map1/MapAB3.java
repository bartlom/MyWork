package com.codingbat.Map1;

import java.util.Map;

public class MapAB3 {
    /*
    Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.

mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}	{"a": "aaa", "b": "aaa", "c": "cake"}	OK
mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}	{"a": "bbb", "b": "bbb", "c": "cake"}	OK
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}	{"a": "aaa", "b": "bbb", "c": "cake"}	OK
mapAB3({"ccc": "ccc"}) → {"ccc": "ccc"}	{"ccc": "ccc"}	OK
mapAB3({"c": "a", "d": "b"}) → {"c": "a", "d": "b"}	{"c": "a", "d": "b"}	OK
mapAB3({}) → {}	{}	OK
mapAB3({"a": ""}) → {"a": "", "b": ""}	{"a": "", "b": ""}	OK
mapAB3({"b": ""}) → {"a": "", "b": ""}	{"a": "", "b": ""}	OK
mapAB3({"a": "", "b": ""}) → {"a": "", "b": ""}	{"a": "", "b": ""}	OK
mapAB3({"aa": "aa", "a": "apple", "z": "zzz"}) → {"aa": "aa", "a": "apple", "b": "apple", "z": "zzz"}	{"aa": "aa", "a": "apple", "b": "apple", "z": "zzz"}
     */
    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") ^ map.containsKey("b")) {
            if (map.containsKey("a")) map.put("b", map.get("a"));
            else map.put("a", map.get("b"));
        }
        return map;
    }


}
