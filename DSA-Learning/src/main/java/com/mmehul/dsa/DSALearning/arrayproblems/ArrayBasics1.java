package com.mmehul.dsa.DSALearning.arrayproblems;

/* just basic operations on array assumes array is not sorted :
* Insert: O(1)
* Search: O(n)
* Delete: O(n) : search through the array : delete element in constant time and shifts remaining array in remaining O(n) times
*  */
public class ArrayBasics1 {

    private int[] arr;
    private int nElems;

    public ArrayBasics1(int capacity){
        arr = new int[capacity];
        nElems = 0;
    }

    //Insert operation in array
    public void insert(int val){
        arr[nElems] = val;
        nElems++;
    }

    //display array
    public void display(){
        for(int j =0; j<nElems;j++)
            System.out.print(arr[j] + " ");
        System.out.println();
    }

    //search element in array
    public boolean search(int searchVal){
        int i=0;
        for(;i<nElems;i++)
            if(arr[i] == searchVal)
                break;

        return i != nElems;
    }

    //Delete element from array
    public boolean delete(int val){
        int i=0;
        for(;i<nElems;i++)
            if(arr[i] == val)
                break;

        if(i == nElems)
            return false;

        for(int k=i;k<nElems-1;k++)
            arr[k] = arr[k+1];
        nElems--;
        return true;
    }

    public static void main(String[] args) {
        ArrayBasics1 arr = new ArrayBasics1(10);
        arr.insert(10);
        arr.insert(4);
        arr.insert(9);
        arr.insert(16);
        arr.insert(58);
        arr.insert(47);
        arr.insert(7);

        //display array
        arr.display();

        //search operation in array
        int searchVal = 44;
        if(arr.search(searchVal))
            System.out.println(searchVal + " present in the array");
        else
            System.out.println(searchVal +" not present in the array");

        //delete operation in array
        arr.delete(58);

        //display array
        arr.display();
    }

}
