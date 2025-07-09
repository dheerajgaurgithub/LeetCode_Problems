class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]leftToRight=new int[n];
        int[]rightToLeft=new int[n];
        leftToRight[0]=1;
        for(int i=1;i<n;i++){
            leftToRight[i]=leftToRight[i-1]*nums[i-1];
        }
        rightToLeft[n-1]=1;
        for(int i=n-2;i>=0;i--){
            rightToLeft[i]=rightToLeft[i+1]*nums[i+1];
        }

        int[]ans=new int[n];

        for(int i=0;i<n;i++){
            ans[i]=leftToRight[i]*rightToLeft[i];
        }

        return ans;

    }
}