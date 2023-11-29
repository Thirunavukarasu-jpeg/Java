package ProblemsWitHBinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,8};
        int target = 3;
        System.out.println(searchInsertPosition(arr,target));
    }

    static int searchInsertPosition(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(start);
        System.out.println(end);
        return start;
    }
}
