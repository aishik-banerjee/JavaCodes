/*
You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.
The test cases are generated so that a unique mapping will always exist.

Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".

*/
package StringQuestions;

public class DecryptString {

    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        String finalStr = "";
        int len = s.length();
        while(len > 0){
            if(s.charAt(len - 1) == '#'){
                int num = Integer.parseInt(String.valueOf(s.substring(len - 3, len - 1)));
                char ch = (char)('a' + num - 1);
                finalStr = ch + finalStr;
                len = len - 3;
            }else{
                int num = s.charAt(len - 1) - '0';
                char ch = (char)('a' + num - 1);
                finalStr = ch + finalStr;
                len--;
            }
        }
        return finalStr;
    }
    
}
