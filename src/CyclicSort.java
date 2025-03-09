import java.util.Arrays;

public class CyclicSort {
    
    public static void main(String[] args) {
        
        int arr[]={1,3,9,8,5,2,4,6,7};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclic(int arr[]){

        int i=0;
        int end=arr.length;
        while (i<end) {
            int correctIndex=arr[i]-1;
            if( correctIndex < end && arr[i] != arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else{
                i++;
            }
        }

    }
}
