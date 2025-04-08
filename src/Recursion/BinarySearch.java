package Recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = binarySearch(arr, target, 0, arr.length-1);
        System.out.println("Index Position is " + ans);
    }

    public static int binarySearch(int arr[], int target, int start, int end){

        if(start > end){
            return -1;
        }

        int mid= start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }

        else if(arr[mid] > target){
            return binarySearch(arr, target, start, mid-1);
        }
        
        else{
            return binarySearch(arr, target, mid+1, end);
        }

    }
    
}
