package ProblemsWitHBinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int target = 3;
        System.out.println(searchInRotatedArray(arr, target));
    }
    static int searchInRotatedArray(int[] arr, int target) {
        int pivot = findPivotInRotatedArray(arr);
        if(pivot != -1) {
            if(arr[pivot] == target) {
                return pivot;
            }
            int result = Integer.MIN_VALUE;
            if(target >= arr[0]) {
                result = binarySearch(arr,target,0,pivot- 1);
            } else {
                result = binarySearch(arr,target, pivot + 1, arr.length - 1);
            }
            return result;
        } else {
            return binarySearch(arr,target,0,arr.length-1);
        }
    }
    static int findPivotInRotatedArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        if(start == end) {
            return end;
        }
        while( start < end) {
            int mid = start +  (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target,int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return  -1;
    }
}
