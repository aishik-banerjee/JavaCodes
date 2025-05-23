/*
 *  Shuffle the Array
 *  Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    Return the array in the form [x1,y1,x2,y2,...,xn,yn].

    Example 1:

    Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7] 
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */
package ArrayQuestions;
import java.util.Arrays;

public class ShuffleArray {

    public static void main(String[] args) {
        int nums[]={2,5,1,3,4,7};
        int shuffledArray[] = shuffle(nums, 3);
        System.out.println("Running Sum "+ Arrays.toString(shuffledArray));
    }

    public static int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int i=0;
        int j=n;
        int counter=0;
        while (counter<(2*n)) {
           if(counter%2==0){
            arr[counter]=nums[i];
            i++;
           } 
           else{
            arr[counter]=nums[j];
            j++;
           }
           counter=counter+1;
        }
        return arr;
    }
    
}
