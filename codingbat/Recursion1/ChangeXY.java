package com.codingbat.Recursion1;

public class ChangeXY {

/*

Given a string, compute recursively (no loops) a new string
where all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"

*/

    public String changeXY(String str) {

        char check = 'x';

        if (str.length() <= 1) {
            return checkCharLastChar(str, check);
        }
        return checkChar(str, check) + changeXY(str.substring(1));
    }


    public String checkChar(String str, char check) {
        String result = "";
        if (str.charAt(0) == check) {
            result = "y";
        } else {
            result = String.valueOf(str.charAt(0));
        }
        return result;
    }

    public String checkCharLastChar(String str, char check) {
        String result = "";
        if (str.length() > 0 && str.charAt(0) == check) {
            result = "y";
        } else if (str.length() > 0) {
            result = String.valueOf(str.charAt(0));
        }
        return result;
    }
}