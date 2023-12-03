package ProblemsWithCycleSort;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,0};
        System.out.println(findMissingNumber(arr));
    }
    static int findMissingNumber(int[] arr) {
        int[] result = cycleSortWithMissingNumber(arr);
        for (int i = 0; i < result.length; i++) {
            if(result[i] == result.length) {
                return i;
            }
        }
        return arr.length;
    }

    static int[] cycleSortWithMissingNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while(arr[i] != i && arr[i] != arr.length) {
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
