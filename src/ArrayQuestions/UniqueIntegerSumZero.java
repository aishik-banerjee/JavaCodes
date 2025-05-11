/*
 * Find N Unique Integers Sum up to Zero
 * Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]


    public int[] sumZero(int n) {
        int[] A = new int[n];
        for (int i = 0; i < n; ++i)
            A[i] = i * 2 - n + 1;
        return A;
    }


    class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int sum = 0;

        for (int i = 0; i < n-1; i++) {
            result[i] = i+1;
            sum += result[i];
        }
        result[n - 1] = -1 * sum;
        return result;
    }

}
 */

package ArrayQuestions;
import java.util.Arrays;

public class UniqueIntegerSumZero {

    public static void main(String[] args) {
        int n=5;
        int uniqueArray[] = sumZero(n);
        System.out.println("Unique Sum "+ Arrays.toString(uniqueArray));
    }

    public static int[] sumZero(int n) {

        int arr[]=new int[n];
        
        if(n==1)
        return new int[]{0};

        int i=0;
        int j=n-1;
        while (i<j) {
            if(i==j){
                arr[i]=0;
            }
            arr[i]=j;
            arr[j]=-j;  
            i++;
            j--; 
        }
        return arr;
    }  
}
