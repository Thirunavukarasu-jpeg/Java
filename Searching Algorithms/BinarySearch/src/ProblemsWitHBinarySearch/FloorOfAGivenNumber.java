package ProblemsWitHBinarySearch;
// Floor of a given number.
public class FloorOfAGivenNumber {
    public static void main(String[] args) {
        int[] arrOne = {0,1,2,3,4,5,6,7,8,9,10,11,12,45,56,67,78,789};
        int[] arrTwo = {2,3,5,9,14,16,18};
        System.out.println(findFloorOfANumber(arrTwo,15));
    }

    static int findFloorOfANumber(int[] arr, int target) {
        if(arr.length > 0) {
            int start = 0, end = arr.length - 1,mid,floorNumber = Integer.MIN_VALUE;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if(arr[mid] ==  target) {
                    return arr[mid];
                } else if (arr[mid] < target) {
                    floorNumber = arr[mid];
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
//            return floorNumber;
            return end;

        }
        return -1;
    }
}
