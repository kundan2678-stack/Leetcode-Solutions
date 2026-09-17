class Solution {
    public int singleNumber(int[] nums) {
        int size = 0;

        for(int i : nums){
            size = size ^ i;
        }
        return size;
    } 
}