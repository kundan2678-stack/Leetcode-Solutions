import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        // Step 1: Array ko sort karein
        Arrays.sort(nums);

        int count = 1;
        for (int i = 0; i < n; i++) {
            // Agar agla element same hai, toh count badhayein
            if (i < n - 1 && nums[i] == nums[i + 1]) {
                count++;
            } else {
                // Element change hone par check karein ki count > n/3 hai ya nahi
                if (count > n / 3) {
                    result.add(nums[i]);
                }
                count = 1; // Count reset
            }
        }

        return result;
    }
}