package com.codingbat.Ap1;

public class DividesSelf {
    /*
    We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
    So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly.
    We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself.
    Note: use % to get the rightmost digit, and / to discard the rightmost digit.

dividesSelf(128) → true
dividesSelf(12) → true
dividesSelf(120) → false
     NIE ROZUMIEM DO KONCA ALE DZIAL BO PRINTUJE SI EDZIWNA LICZBA*/
    public static int n = 217;

    public static boolean dividesSelf(int n) {
        boolean result=true;

        for (int i = 0; i < String.valueOf(n).length(); i++) {
            if ((((int) String.valueOf(n).charAt(i))-48)==0 || n % ((int) String.valueOf(n).charAt(i)-48) != 0) {
                System.out.println((((int) String.valueOf(n).charAt(i))-48));
                result= false;break;
            }   }
        return result;
    }}
