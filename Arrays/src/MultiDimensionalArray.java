import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
         int[][] arr2D = {
                 {1,2,3},
                 {4,5},
                 {6,7,8,9}
         };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
