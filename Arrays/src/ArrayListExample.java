import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10 );
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(12);
        System.out.println(arrayList);
        for (Integer n: arrayList) {
            System.out.println(n);
        }
    }
}
