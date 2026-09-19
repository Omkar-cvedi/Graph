package in.binarySearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = nums1.length>nums2.length?nums2:nums1;
        int[] nums = nums1.length>nums2.length?nums1:nums2;
        Arrays.sort(nums);
        Set<Integer> list = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int low = 0;
            int high = nums.length-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(arr[i]==nums[mid]){
                    list.add(arr[i]);
                    break;
                }
                else if(arr[i]<nums[mid]){
                    high = mid-1;
                }else low = mid+1;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
