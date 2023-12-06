public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearchWithRecursion(arr,500,0,arr.length - 1));
    }
    static int binarySearchWithRecursion(int[] arr, int target,int start, int end) {
        if(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return binarySearchWithRecursion(arr,target,start,mid-1);
            } else {
                return binarySearchWithRecursion(arr,target,mid + 1,end);
            }
        }

        return -1;
    }
}
