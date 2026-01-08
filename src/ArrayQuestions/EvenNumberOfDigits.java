/*
Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
*/

package ArrayQuestions;
import java.util.*;
public class EvenNumberOfDigits {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int evenDigits = findNumbers(nums);
        System.out.println("Number of elements with even number of digits are "+ evenDigits);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(String.valueOf(nums[i]).length() % 2 == 0)
                count = count + 1;
        }
        return count;
    }
    
}
