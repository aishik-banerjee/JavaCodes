package SearchingQuestions;

public class SquareRoot {

    public static void main(String[] args) {
        int num=8;
        int sqrt = mySqrt(num);
        System.out.println("Square Root of "+ num + " is "+ sqrt);

    }



    public static int mySqrt(int x) {

        if(x==0 || x==1)
        return x;

        int start = 1;
        int end = x;
        int mid = 0;

        while (start <= end){

            mid = start + (end - start) / 2;

            if(mid > x/mid){
                end = mid - 1;
            }else if(mid < x/mid){
                start = mid + 1;
            }else{
                return mid;
            }
        }

        return end;
    }    
    
}
