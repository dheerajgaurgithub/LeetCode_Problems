class Solution {
    public int firstMissingPositive(int[] nums) {
        int target=1;
        Arrays.sort(nums);
        for(int num:nums){
            if(num==target){
                target++;
            }
        }
        return target;
    }
}