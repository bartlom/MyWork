package com.codingbat.Map1;

import java.util.Map;

public class mapShare {

    /*
    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.

mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}	{"a": "aaa", "b": "aaa"}	OK
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}	{"b": "xyz"}	OK
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}	{"a": "aaa", "b": "aaa", "d": "hi"}	OK
mapShare({"a": "xyz", "b": "1234", "c": "yo", "z": "zzz"}) → {"a": "xyz", "b": "xyz", "z": "zzz"}	{"a": "xyz", "b": "xyz", "z": "zzz"}	OK
mapShare({"a": "xyz", "b": "1234", "c": "yo", "d": "ddd", "e": "everything"}) → {"a": "xyz", "b": "xyz", "d": "ddd", "e": "everything"}	{"a": "xyz", "b": "xyz", "d": "ddd", "e": "everything"}



     */
    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a") && map.get("a") != null) {
            map.put("b", map.get("a"));
            map.remove("c");
        } else map.remove("c");
        return map;
    }


}
