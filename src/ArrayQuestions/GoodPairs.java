/*
 *  Number of Good Pairs
 *  Given an array of integers nums, return the number of good pairs.

    A pair (i, j) is called good if nums[i] == nums[j] and i < j.

    Example 1:
    Input: nums = [1,2,3,1,1,3]
    Output: 4
    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 */

package ArrayQuestions;
import java.util.Arrays;

public class GoodPairs {

    public static void main(String[] args) {
        int nums[] = {1,2,3,1,1,3};
        int goodPairs = numIdenticalPairs(nums);
        System.out.println("Number of good pairs are "+ goodPairs);
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count = count + 1;
                }
            }
        }
        return count;
    }
    
}
