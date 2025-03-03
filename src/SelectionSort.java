import java.util.Arrays;

public class SelectionSort {
    
        public static void main(String[] args) {
        
        int arr[]={1,5,9,8,7,4,3,6};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selection(int arr[]){

        for(int i=0;i<arr.length;i++){

            int end=arr.length - i - 1;
            int maxIndex=getMax(arr, 0,end);
            swap(arr,maxIndex,end);
        }

    }

    public static int getMax(int arr[],int start, int end){

        int max = start;

        for(int i=start;i<=end;i++){

            if(arr[i] >arr[max ]){
                max=i;
            }
        }
        return max;

    }

    public static void swap(int arr[],int max, int end){

        int temp=arr[max];
        arr[max]=arr[end];
        arr[end]=temp;

    }
}
