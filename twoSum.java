// 8. Two SumJAVA  ALGORITHMIC THINKING  SEARCHING  PUBLIC
// Write a function that, when passed a list and a target sum, returns, efficiently with respect to time used, two distinct zero-based indices of any two of the numbers, whose sum is equal to the target sum. If there are no two numbers, the function should return null.

// For example, findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10) should return a single dimensional array with two elements and contain any of the following pairs of indices:

// 0 and 3 (or 3 and 0) as 3 + 7 = 10
// 1 and 5 (or 5 and 1) as 1 + 9 = 10
// 2 and 4 (or 4 and 2) as 5 + 5 = 10


import java.util.HashMap;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        int complement;

        for (int i = 0; i<nums.length; i++) {
            complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] {i, map.get(complement)};
            }
            map.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}