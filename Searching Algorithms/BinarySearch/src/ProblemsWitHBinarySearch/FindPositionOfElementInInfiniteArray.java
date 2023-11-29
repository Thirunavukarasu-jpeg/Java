package ProblemsWitHBinarySearch;

public class FindPositionOfElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88};
        System.out.println(findPositionInInfiniteArray(arr,22));


    }
    static int findPositionInInfiniteArray(int[] arr, int target) {
        int start = 0, end = 1;
        while(target > arr[end]) {
           int temp = end + 1;
           end = end + (end - start + 1) * 2;
           start = temp;
        }
        return BS(arr,target,start,end);
    }

    static int BS(int[] arr, int target, int start, int end) {
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
        return -1;
    }
}

