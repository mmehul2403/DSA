package com.mmehul.dsa.DSALearning.sorting;

public class BubbleSort {

    private int[] arr;
    private int nElems;

    public BubbleSort(int capacity){
        arr = new int[capacity];
        nElems=0;
    }

    public void insert(int val){
        arr[nElems] = val;
        nElems++;
    }

    public void display(){
        for(int i=0;i<nElems-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void bubbleSort(){
        boolean isSwapMade = false;
        for(int j=nElems-1; j > 0;j--){
            for(int i=0;i<j;i++){
                if(arr[i] > arr[j]){
                    swap(i,j);
                    isSwapMade = true;
                }
            }
            if(!isSwapMade)
                break;
        }
    }

    public void swap(int indx1, int indx2){
        int temp = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = temp;
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort(10);
        obj.insert(40);
        obj.insert(28);
        obj.insert(32);
        obj.insert(0);
        obj.insert(11);
        obj.insert(65);
        obj.insert(58);
        obj.insert(66);
        obj.insert(9);

        obj.display();
        obj.bubbleSort();
        obj.display();
    }

}
