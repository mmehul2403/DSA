package com.mmehul.dsa.DSALearning.sorting;

public class MergeSort {

    private static void mergeSort(int[] unsortedArray, int length) {
        if(length < 2){
            return ;
        }else{
            //set mid and left & right array
            int mid =length/2;
            int rightLength = length-mid;

            int[] left= new int[mid];
            int[] right = new int[rightLength];

            //populate left and right array
            System.arraycopy(unsortedArray, 0, left, 0, mid);
            if (length - mid >= 0)
                System.arraycopy(unsortedArray, mid, right, 0, length - mid);

            mergeSort(left,mid);
            mergeSort(right,rightLength);

            mergeArray(unsortedArray,left,right,mid,rightLength);
        }
    }

    private static void mergeArray(int[] sortedArray,int[] left,int[] right, int mid, int end) {
        int i=0,j=0,k=0;

        //For event length array
        while(i <mid && j < end){
            if(left[i] <= right[j]){
                sortedArray[k++] = left[i++];
            }else{
                sortedArray[k++]=right[j++];
            }
        }

        // For odd length array
        while(i <mid){
            sortedArray[k++] = left[i++];
        }

        while(j <end){
            sortedArray[k++] = right[j++];
        }

    }

    public static void main(String[] args) {
        //Define the unsorted array
        int[] arr = {5,9,1,2,7,4,66,8,77,3,6};
        mergeSort(arr,arr.length);
        printSortedArray(arr);
    }

    //Print array
    private static void printSortedArray(int[] sortedArray) {
        for (int j : sortedArray) {
            System.out.print(j + ", ");
        }
    }
}
