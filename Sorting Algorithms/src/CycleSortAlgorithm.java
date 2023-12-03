import java.util.Arrays;

public class CycleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }
    static int[] cycleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            while (arr[i] - 1 != i) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
}
