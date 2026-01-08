/*
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
Example 1:
Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
*/

package ArrayQuestions;
public class pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.toLowerCase().charAt(i);
            arr[ch-'a'] += 1;
        }

        for(int i=0;i<arr.length;i++){
        if(arr[i]==0)
        return false;
        }
        return true;
    }
}

/*
 * class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                return false;
            }
         }
        return true;
    }
}

 */
