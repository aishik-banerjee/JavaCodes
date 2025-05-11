/*
 *  How Many Numbers Are Smaller Than the Current Number
 *  Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
    Return the answer in an array.
    Example 1:

    Input: nums = [8,1,2,2,3]
    Output: [4,0,1,1,3]
    Explanation: 
    For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
    For nums[1]=1 does not exist any smaller number than it.
    For nums[2]=2 there exist one smaller number than it (1). 
    For nums[3]=2 there exist one smaller number than it (1). 
    For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 */
package ArrayQuestions;
import java.util.Arrays;
public class SmallerThanCurrentNumber {

     public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        int smallerArray[] = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(smallerArray));
    }
    
    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int count[]=new int[101];

        for(int i=0;i<nums.length;i++){
            count[nums[i]]=count[nums[i]] + 1;
        }
        
        for(int j=1;j<count.length;j++){
            count[j] = count[j] + count[j-1];
        }

        for(int k=0;k<nums.length;k++){
            int position = nums[k];
            nums[k] = position==0 ? 0 : count[position-1];
        }
        return nums;
    }
}
