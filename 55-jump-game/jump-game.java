class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length < 2) return true;

        int count = nums[0];

        for (int i = 1; i < nums.length; i++) {
            count--; 
            if (count < 0) return false; 
            count = Math.max(count, nums[i]); 
        }

        return true; 
    }
}
