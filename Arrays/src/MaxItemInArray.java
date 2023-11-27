import java.util.Arrays;
import java.util.Scanner;

public class MaxItemInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
        System.out.println(findMaxItemInArray(arr));
        System.out.println(findMaxItemInArrayInARange(arr,2,4));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int findMaxItemInArray(int[] arr) {
        int max = arr[0];
        for (int n: arr) {
            if(n > max) {
                max = n;
            }
        }
        return max;
    }

    static int findMaxItemInArrayInARange(int[] arr, int start, int end) {
        int max = arr[0];
        if(start >= 0 && end <= arr.length - 1) {
            for (int i = start; i <= end; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                }
            }
        } else {
            return -1;
        }
        return max;
    }

    static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i < (arr.length - 1) - i) {
                int temp = arr[i];
                arr[i] = arr[(arr.length-1) - i];
                arr[(arr.length-1) - i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
