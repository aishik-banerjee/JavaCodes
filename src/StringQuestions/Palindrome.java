/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
*/

package StringQuestions;

public class Palindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String updatedString = "";
        for(int i=0;i<s.length();i++){
            if(((int)s.charAt(i) >= 97 && (int)s.charAt(i) <= 122) || ((int)s.charAt(i)     >=              48 && (int)s.charAt(i) <= 57)){
                updatedString = updatedString + s.charAt(i);
            }
        }

        int start = 0;
        int end = updatedString.length()-1;

        while(start < end){
            if(updatedString.charAt(start) != updatedString.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
    
}
