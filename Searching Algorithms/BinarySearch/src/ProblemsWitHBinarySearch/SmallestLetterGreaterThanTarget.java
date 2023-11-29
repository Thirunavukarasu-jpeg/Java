package ProblemsWitHBinarySearch;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c','f','i'};
        System.out.println(a(arr,'c'));
    }
    static char a(char[] letters, char target) {
        int start = 0, end = letters.length - 1, mid;
        // char result = letters[0];
        while(start <= end) {
            mid = start + (end - start) / 2;
            if(letters[mid] > target) {
                // result = letters[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // return result;
        // if(start == letters.length) {
        //     return letters[0];
        // }
        // return letters[start];
        return letters[start % letters.length];
    }
}
