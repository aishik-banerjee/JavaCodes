package Recursion;

import java.util.ArrayList;

public class ArrayProblems {

    public static void main(String[] args) {
        int arr[]={5,6,6,6,8,9,7,4,1,2,3,6};
        System.out.println(linearSearchArrayList3(arr,0, 6));
        //linearSearchArrayList2(arr, 0, 6);
        //System.out.println(list);
    }

    public static boolean sorted(int arr[], int index){

        if(index==arr.length-1)
        return true;

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    public static int linearSearch(int arr[], int index, int target){

        if(index == arr.length)
        return -1;

        if(arr[index]==target)
        return index;
        else 
        return linearSearch(arr, index + 1, target);
    }

    public static ArrayList<Integer> linearSearchArrayList(int arr[], int index, int target, ArrayList<Integer> list){

        if(index == arr.length)
        return list;

        if(arr[index]==target)
        list.add(index);
         
        return linearSearchArrayList(arr, index + 1, target, list);
    }

    public static ArrayList<Integer> list=new ArrayList<Integer>();

    public static void linearSearchArrayList2(int arr[], int index, int target){

        if(index == arr.length)
        return;

        if(arr[index]==target)
        list.add(index);
         
        linearSearchArrayList(arr, index + 1, target, list);
    }

    public static ArrayList<Integer> linearSearchArrayList3(int arr[], int index, int target){

        ArrayList<Integer> list=new ArrayList<Integer>();

        if(index == arr.length)
        return list;

        if(arr[index]==target)
        list.add(index);
         
        ArrayList<Integer> ansFromBelowCalls =  linearSearchArrayList3(arr, index + 1, target);
        list.addAll(ansFromBelowCalls);

        return list;
    }
    
}
