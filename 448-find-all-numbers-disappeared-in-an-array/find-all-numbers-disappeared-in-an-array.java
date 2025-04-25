import java.util.*;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int idx = Math.abs(nums[i]) - 1;  
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {4,3,2,7,8,2,3,1};
        System.out.println("Input:  " + Arrays.toString(nums1));
        System.out.println("Output: " + sol.findDisappearedNumbers(nums1));  

        int[] nums2 = {1,1};
        System.out.println("Input:  " + Arrays.toString(nums2));
        System.out.println("Output: " + sol.findDisappearedNumbers(nums2)); 
    }
}

