import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {9,8,6,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int start = 0, end = i + 1;
            while(start < end && end < arr.length) {
                if(arr[end] < arr[end - 1]) {
                    int temp = arr[end];
                    arr[end] = arr[end - 1];
                    arr[end - 1] = temp;
                }
                end --;
            }
//            System.out.print(start + " ");
//            System.out.print(end);
//            System.out.println();
        }
        return arr;
    }
}
