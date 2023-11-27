import java.util.Arrays;
import java.util.Scanner;

public class SwapNumbersInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        int first = input.nextInt(), second = input.nextInt();

        System.out.println(Arrays.toString(arr));
        Swap(arr,first,second);
        System.out.println(Arrays.toString(arr));
    }
    static void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
