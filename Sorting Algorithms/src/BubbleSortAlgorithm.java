import java.util.Arrays;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {7,6,3,2,2,5,7,3};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    static int[] bubbleSort(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j - 1] > arr[j]) {
                    isSwapped = true;
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            if(!isSwapped) {
                return arr;
            }
        }
        return arr;
    }
}
