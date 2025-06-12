
class Solution {
    public int findClosestNumber(int[] nums) {
    Arrays.sort(nums); 
    int closest = nums[0];

    for (int i = 1; i < nums.length; i++) {
        int current = nums[i];

        if (Math.abs(current) < Math.abs(closest)) {
            closest = current;
        } else if (Math.abs(current) == Math.abs(closest)) {
            closest = Math.max(closest, current);
        }
    }

    return closest;
    }
}
