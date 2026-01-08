/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
*/

package StringQuestions;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {

        String[] words = s.split(" ");
        int index = words.length;
        String text = words[index - 1];
        return text.trim().length();
        
    }
    
}
