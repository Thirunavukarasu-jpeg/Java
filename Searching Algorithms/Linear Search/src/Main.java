import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,4,5,6,7,8,9};
        System.out.println(LinearSearch(arr,input.nextInt()));
    }
    static int LinearSearch(int[] arr, int target) {
        if(arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == target) {
                    return i;
                }
            }
        }
        return -1;
    }
}

