/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "Mr Ding"
Output: "rM gniD"
*/

package StringQuestions;

public class ReverseStringWords {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }


    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        for(String str : words){
            result = result + " ";
            for(int i = str.length()-1 ; i>=0;i--){
                result = result + str.charAt(i);
            }
        }
        return result.trim();
    }
    
}
