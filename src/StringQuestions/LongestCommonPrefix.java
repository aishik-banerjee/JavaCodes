/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

package StringQuestions;
import java.util.*;
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        int count = 0;
        while( i < first.length() && i < last.length()){
            if(first.charAt(i) != last.charAt(i)){
                break;
            }else{
                count++;
                i++;
            }
        }
        return first.substring(0, count);
    }
    
}
