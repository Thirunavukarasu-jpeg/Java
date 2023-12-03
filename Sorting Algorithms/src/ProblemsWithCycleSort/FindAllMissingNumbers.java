package ProblemsWithCycleSort;

import java.util.Arrays;

public class FindAllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }
    static int[] findAllMissingNumbers(int[] arr) {
        int[] result = cycleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1) {

            }
        }
        return arr;
    }
    static int[] cycleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while(arr[i] - 1 != i && arr[arr[i] - 1] != arr[i] ) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
