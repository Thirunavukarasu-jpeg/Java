import java.util.Arrays;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = i, end = arr.length - 1;
            int getMinIndex = getMinIndex(start,end, arr);
            int temp = arr[getMinIndex];
            arr[getMinIndex] = arr[start];
            arr[start] = temp;
        }
        return arr;
    }
    static int getMinIndex(int start, int end, int[] arr) {
        int minIndex = start;
        for (int i = start; i <= end; i++) {
            if(arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
