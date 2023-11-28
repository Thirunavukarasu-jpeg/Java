public class FindNumbersWithEvenDigits {
    public static void main(String[] args) {
        int[] arr = {1,2,44,5,65,7,6656};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int evenDigitsCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(isEven(nums[i])) {
                evenDigitsCount++;
            }
        }
        return evenDigitsCount;
    }

    static boolean isEven(int num) {
        int digitCount = 0;
        while(num > 0) {
            digitCount++;
            num = num/10;
        }

        return digitCount % 2 == 0;
    }
}
