import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            while (j > 0 && i < arr.length - 1) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}
