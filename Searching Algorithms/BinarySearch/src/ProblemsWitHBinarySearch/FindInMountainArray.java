package ProblemsWitHBinarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 2;
        System.out.println(findInMountainArray(arr,target));
    }

    static int findInMountainArray(int[] arr, int target) {
        int peak = findPeakInMountain(arr);
        int result = orderAgnosticBS(arr,target,0,peak+1);
        if(result == -1) {
            result = orderAgnosticBS(arr,target,peak+1,arr.length-1);
            System.out.println(result);
        }
        return result;
    }

    static int findPeakInMountain(int[] arr) {
        int start = 0, end = arr.length - 1;
        while( start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean ascending = false;
        int mid;
        if(arr.length > 0) {
            if(arr[start] < arr[end-1]) {
                ascending = true;
            }
        }
        while (start <= end) {
            mid = start + (end-start) / 2;
            if(arr[mid] < target) {
                if(ascending) {
                    start = mid+1;
                } else {
                    end = mid -1;
                }
            } else if (arr[mid] > target) {
                if(ascending) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                return mid;
            }
        }

        return -1;
    }
}
