package com.codingbat.Recursion1;

public class ChangePi {

/*

Given a string, compute recursively (no loops) a new string
where all appearances of "pi" have been replaced by "3.14".

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"

*/

    public String changePi(String str) {

        String check = "pi";

        if (str.length() <= 2) {
            return checkStringEnd(str, check);
        }
        return checkString(str, check);
    }


    public String checkString(String str, String check) {

        String result = "";

        if (str.substring(0, 2).equals(check)) {
            result = "3.14";
            return result + changePi(str.substring(2));
        } else {
            result = str.substring(0, 1);
        }
        return result + changePi(str.substring(1));
    }

    public String checkStringEnd(String str, String check) {

        String result = "";

        if (str.length() == 2 &&
                str.substring(0, 2).equals(check)) {
            result = "3.14";
        } else if (str.length() > 0) {
            result = str;
        }
        return result;
    }
}
