public class Recursion {
    public static void main(String[] args) {
        printNumbers(0,10);
    }
    static void printNumbers(int current,int limit) {
        if(current == limit) {
            System.out.println(current);
            return;
        }
        System.out.println(current);
        printNumbers(current + 1, limit);

    }
}
