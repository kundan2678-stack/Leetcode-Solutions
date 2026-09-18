class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        int count = 0;

        for(int i=0;i<size;i++){
            if(nums[i]!=0){
                nums[count] = nums[i];
                count++;
            }
        }
        while(count<size){
            nums[count] = 0;
            count++;
        }
         for (int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }
        //return nums;
    }
}