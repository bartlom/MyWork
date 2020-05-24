package com.codingbat.Map1;

import java.util.Map;

public class Topping3 {
    /*
    Given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries".
    If the key "salad" has a value, set that as the value for the key "spinach".

topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}	{"potato": "ketchup", "fries": "ketchup"}	OK
topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}	{"potato": "butter", "fries": "butter"}	OK
topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}	{"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}	OK
topping3({"toast": "butter", "salad": "oil", "potato": "ketchup"}) → {"toast": "butter", "spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}	{"toast": "butter", "spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}	OK
topping3({}) → {}	{}	OK
topping3({"salad": "pepper", "fries": "salt"}) → {"spinach": "pepper", "salad": "pepper", "fries": "salt"}	{"spinach": "pepper", "salad": "pepper", "fries": "salt"}
     */
    public Map<String, String> topping3(Map<String, String> map) {
        if (map.get("potato") != null) map.put("fries", map.get("potato"));
        if (map.get("salad") != null) map.put("spinach", map.get("salad"));
        return map;
    }
}
