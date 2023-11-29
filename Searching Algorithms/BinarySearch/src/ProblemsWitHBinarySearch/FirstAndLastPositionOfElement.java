package ProblemsWitHBinarySearch;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,6,6,7,7,8,8,8,8};
        System.out.println(Arrays.toString(findFirstAndLast(arr,3)));
    }
    static int[] findFirstAndLast(int[] nums, int target) {
        int[] result = {-1,-1};
        result[0] = findPosition(nums,target,true);
        if(result[0] != -1) {
            result[1] = findPosition(nums,target,false);
        }
        return result;
    }

    static int findPosition(int[] nums,int target, boolean findFirstPostion) {
        int start = 0, end = nums.length - 1, mid;
        int position = -1;
        while(start <= end) {
            mid = start + (end - start) / 2;
            if(nums[mid] > target) {
                end = mid -1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                position = mid;
                if(findFirstPostion) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return position;
    }
}
