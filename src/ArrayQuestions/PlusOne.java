/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
*/

package ArrayQuestions;
import java.util.*;
public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
        
    }

    public static int[] plusOne(int[] digits) {

        int n = digits.length - 1;
        int carry = 0;
        int k = 1; // since we need to add 1
        List<Integer> result = new ArrayList<>();
        

        while (n >= 0 || carry > 0) {
            int digitNums = (n >= 0) ? digits[n] : 0;
            int sum = digitNums + carry + k;
            result.add(0, sum % 10);
            n--;
            k = k/10; // after first addition, k becomes 0
            carry = sum / 10;
        }

        int[] arr = new int[result.size()];

        for(int i=0;i<result.size();i++){
            arr[i] = result.get(i);
        }
        
        return arr;
    }
    
}

/*
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;        
    }
}
*/