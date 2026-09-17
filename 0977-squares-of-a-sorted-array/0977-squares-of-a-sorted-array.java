class Solution {
    public int[] sortedSquares(int[] nums) {
        int size = nums.length;

        for(int i=0; i<size; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);

        System.out.print(Arrays.toString(nums));

    return nums;  
    }
    
}