import java.util.Arrays;

public class CycleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(cycleSort(arr)));
    }
    static int[] cycleSort(int[] arr) {
        int initial = 0;
        while(initial < arr.length - 1) {
            if(arr[initial] - 1 != initial) {
                int temp = arr[arr[initial] - 1];
                arr[arr[initial] - 1] = arr[initial];
                arr[initial] = temp;
            } else {
                initial++;
            }
        }
        return arr;
    }
}
