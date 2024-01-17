package org.example;

public class Sorting {

    public static int[] bubleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int startpoint = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[startpoint] > arr[j]) {
                    startpoint = j;
                }
            }
            int temp=arr[startpoint];
            arr[startpoint] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static int[] insertionSort(int arr[]){
        for (int i=1;i<arr.length;i++){
            int temp= arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] abc = {5, 3, 8, 1, 9};
        int[] ints = insertionSort(abc);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
