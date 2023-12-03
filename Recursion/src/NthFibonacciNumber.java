public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(getNthFibonacciNumber(7));
    }
    static int getNthFibonacciNumber(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return getNthFibonacciNumber(n-1) + getNthFibonacciNumber(n-2);
    }
}
