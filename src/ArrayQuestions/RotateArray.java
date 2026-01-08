/*
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/

package ArrayQuestions;
import java.util.Arrays;
public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }

    public static void rotate(int[] nums, int k) {

        k = k % nums.length; // In case k is greater than length of array

        reverse(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

        reverse(nums, 0, k-1);
        System.out.println(Arrays.toString(nums));

        reverse(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        
    }

    public static void reverse(int[] nums, int start, int end){

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
    
}
