package com.codingbat.Ap1;

public class UserCompare {
    /*
    We have data for two users, A and B, each with a String name and an int id.
    The goal is to order the users such as for sorting. Return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same.
    Order first by the string names, and then by the id numbers if the names are the same.
    Note: with Strings str1.compareTo(str2) returns an int value which is negative/0/positive to indicate how str1 is ordered to str2 (the value is not limited to -1/0/1).
    (On the AP, there would be two User objects, but here the code simply takes the two strings and two ints directly. The code logic is the same.)

userCompare("bb", 1, "zz", 2) → -1
userCompare("bb", 1, "aa", 2) → 1
userCompare("bb", 1, "bb", 1) → 0
     */

    public static String aName = "bb";
    public static String bName = "zz";
    public static int aId = 1;
    public static int bId = 2;

    public static int userCompare(String aName, int aId, String bName, int bId) {
        int result = 0;

        for (int i = 0; i < Math.min(aName.length(), bName.length()); i++) {
            if (aName.charAt(i) != bName.charAt(i)) {
                if (aName.charAt(i) < bName.charAt(i)) {
                    result = -1;
                } else result = 1;
                break;
            } else if (aId != bId) {
                if (aId < bId) result = -1;
                else result = 1;
            }
        }
        return result;
    }


}
