class Solution {
    public int maxArea(int[] height) {
        int MaxArea=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            MaxArea=Math.max(MaxArea,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return MaxArea;
    }
}