class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int target = totalSum - x;

        // Agar array ka total sum hi x ke barabar hai, toh saare elements lene padenge
        if (target == 0) return nums.length;
        // Agar target negative hai, matlab elements ka sum x tak pahunch hi nahi sakta
        if (target < 0) return -1;

        int currentSum = 0;
        int maxLen = -1;
        int left = 0;

        // Sliding Window Approach
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            while (currentSum > target && left <= right) {
                currentSum -= nums[left];
                left++;
            }

            if (currentSum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen == -1 ? -1 : nums.length - maxLen;
    }
}