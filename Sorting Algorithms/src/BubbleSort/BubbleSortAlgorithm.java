package BubbleSort;

import java.util.Arrays;

public class BubbleSortAlgorithm {
     public static void main(String[] args) {
         int[] arr = {1,2,5,7,65,34,23,21,1,1,2};
         System.out.println(Arrays.toString(bubbleSort(arr)));
     }
     
     static int[] bubbleSort(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = 1; j < arr.length - i; j++) {
                 if(arr[j-1] > arr[j]) {
                     int temp = arr[j-1];
                     arr[j-1] = arr[j];
                     arr[j] = temp;
                 }
             }
         }
         return arr;
     }
}
