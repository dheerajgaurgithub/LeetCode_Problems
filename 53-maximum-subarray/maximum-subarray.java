class Solution {
    public int maxSubArray(int[] nums) {
        int result=nums[0];
        int totalSum=0;
        for(int n:nums){
            if(totalSum<0){
                totalSum=0;
            }
            totalSum+=n;
            result=Math.max(result,totalSum);
        }
        return result;
    }
}