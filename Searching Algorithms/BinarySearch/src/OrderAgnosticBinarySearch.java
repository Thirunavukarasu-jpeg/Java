public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,4,3,2,1,0};
        System.out.println(orderAgnosticBS(arr,6));
    }
    static int orderAgnosticBS(int[] arr, int target) {
        boolean ascending = false;
        int start = 0, end = arr.length -1, mid;
        if(arr.length > 0) {
            if(arr[0] < arr[arr.length-1]) {
                ascending = true;
            } else if (arr[0] == arr[arr.length-1]) {
                return -2;
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
