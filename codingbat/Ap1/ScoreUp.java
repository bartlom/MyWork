package com.codingbat.Ap1;

public class ScoreUp {
    /*

    The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's answers,
    with "?" representing a question left blank. The two arrays are not empty and are the same length.
    Return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.

scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
     */
    public static String[] key = new String[]{"a", "a", "b", "b"};
    public static String[] answer = new String[]{"a", "a", "b", "b"};


    public static int scoreUp(String[] key, String[] answers) {
        int result = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i].length() > 0 && answers[i].equals(key[i])) result += 4;
            else if (answers[i].length() > 0 && !(answers[i].equals("?"))) result -= 1;
        }
        return result;

    }


}
