package in.binarySearch;

import java.util.Arrays;

public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        int notFound = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid != nums[mid]) {
                notFound = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return notFound == -1 ? nums.length : notFound;
    }
}
