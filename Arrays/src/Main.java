import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Array of primitives
        Scanner input = new Scanner(System.in);
        int[] ros;
        ros = new int[5];
        ros[0] = 1;
        ros[1] = 2;
        ros[2] = 3;

//        System.out.println(Arrays.toString(ros));
//        for (int i = 0; i < ros.length; i++) {
//            ros[i] = input.nextInt();
//        }
//
//        for (int ro : ros) {
//            System.out.println(ro);
//        }

//        Array of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        for (String string: str) {
            System.out.println(string);
        }
    }
}