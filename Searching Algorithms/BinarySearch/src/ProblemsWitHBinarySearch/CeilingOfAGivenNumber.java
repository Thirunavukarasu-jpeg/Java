package ProblemsWitHBinarySearch;
// The smallest number greater than equal to the target.
public class CeilingOfAGivenNumber {
    public static void main(String[] args) {
        int[] arrOne = {0,1,2,3,4,5,6,7,8,9,10,11,12,45,56,67,78,789};
        int[] arrTwo = {2,3,5,9,14,16,18};

        System.out.println(findCeilingOfANumber(arrTwo,15));

    }

    static int findCeilingOfANumber(int[] arr, int target) {
        if(arr.length > 0) {
            int ceilingNumber = Integer.MIN_VALUE, start = 0, end = arr.length - 1,mid;
            while(start <= end) {
                mid = start + (end - start) / 2;
                if(arr[mid] == target ) {
//                    return arr[mid];
                    return mid;
                } else if (arr[mid] > target) {
                    ceilingNumber = arr[mid];
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
//            return ceilingNumber;
            return start;
        }
        return -1;
    }
}
