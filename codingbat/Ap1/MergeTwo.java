package com.codingbat.Ap1;

public class MergeTwo {
    /*
    Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
    Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates.
    A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B,
    taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.

mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
     */
    public static String[] a = new String[]{"f", "g", "z"};
    public static String[] b = new String[]{"c", "f", "g"};
    public static int n = 3;

    public static String[] mergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int aCounter = 0;
        int bCounter = 0;
        for (int i = 0; i < n; i++) {
            if ((int) a[aCounter].charAt(0) > (int) b[bCounter].charAt(0)) {
                result[i] = b[bCounter];
                bCounter++;
            } else if ((int) a[aCounter].charAt(0) < (int) b[bCounter].charAt(0)) {
                result[i] = a[aCounter];
                aCounter++;
            } else {
                result[i] = b[bCounter];
                bCounter++;
                aCounter++;
            }
        }
        return result;
    }
}