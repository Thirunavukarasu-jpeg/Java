import java.util.Arrays;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {6,5,32,7,89,2,2,67,9,3,2,6,1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    static int[] bubbleSort(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j - 1]) {
                    isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(!isSwapped) {
                return arr;
            }
        }
        return arr;
    }
}
