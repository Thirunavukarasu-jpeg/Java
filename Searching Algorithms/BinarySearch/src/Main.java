
public class Main {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr,6));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length-1;
        int mid;
        while (start <  end) {
//            mid = (start + end) / 2;
//            This is to prevent the exception which might happen while start + end may sometimes exceed the integer limit.
            mid = start + (end-start) / 2;

            if(arr[mid] > target) {
                end = mid-1;
            }else if(arr[mid] < target) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}