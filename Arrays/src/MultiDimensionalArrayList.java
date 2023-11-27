import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> multiArrayList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            multiArrayList.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                multiArrayList.get(i).add(input.nextInt());
            }
        }
        System.out.println(multiArrayList);
    }
}
