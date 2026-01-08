/*
The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
Example 2:

Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
Example 3:

Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
*/

package ArrayQuestions;
import java.util.*;
public class ArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        List<Integer> result = addToArrayForm(num, k);
        System.out.println("The array form of the integer after adding k is: " + result);
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        int i= num.length - 1;
        int carry = 0;
        List<Integer> result = new ArrayList<>();
        while (i >= 0 || k > 0 || carry > 0) {
            int digitNum = (i >= 0) ? num[i] : 0;
            int digitK = k % 10;
            int sum = digitNum + digitK + carry;
            result.add(0, sum % 10);

            carry = sum / 10;
            i--;
            k = k/10;
        }
        
        return result;
    }
    
}
