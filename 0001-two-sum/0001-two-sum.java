import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Hash Map to store elements and their indices
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Agar complement pehle se map me hai, to answer mil gaya
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Nahi to current element aur index ko map me daal dein
            map.put(nums[i], i);
        }
        
        // Agar koi solution na mile (waise question ke mutabik hamesha ek solution hoga)
        return new int[] {};
    }
}