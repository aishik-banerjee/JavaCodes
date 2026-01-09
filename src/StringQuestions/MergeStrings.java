/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
*/

package StringQuestions;

public class MergeStrings {

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {

        int countOne=0;
        int countTwo=0;
        String mergedString = "";
        while(countOne < word1.length() || countTwo < word2.length()){
            if(countOne < word1.length()){
                mergedString = mergedString + word1.charAt(countOne);
                countOne++;
            }if(countTwo < word2.length()){
                mergedString = mergedString + word2.charAt(countTwo);
                countTwo++;
            }
        }
        return mergedString;
    }
    
}
