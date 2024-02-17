package org.example;

public class Sorting {

    public static int[] bubleSort(int arr[]) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
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

    public static void mergeSort(int a[], int beg, int end)
    {
        if (beg < end)
        {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }
    public static void merge(int a[], int beg, int mid, int end)
    {
        int i=0, j=0, k=beg;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int LeftArray[]=new int[n1];
        int RightArray[]=new int[n2];

        /* copy data to temp arrays */
        for (int ind = 0; ind < n1; ind++)
            LeftArray[ind] = a[beg + ind];
        for (int ind = 0; ind < n2; ind++)
            RightArray[ind] = a[mid + 1 + ind];

        while (i < n1 && j < n2)
        {
            if(LeftArray[i] <= RightArray[j]) {
                a[k] = LeftArray[i];
                i++;
            }
            else {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<n2){
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {

        int[] abc = {5, 3, 8, 1, 2};
//       mergeSort(abc,0,abc.length-1);
        int[] ints = bubleSort(abc);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
