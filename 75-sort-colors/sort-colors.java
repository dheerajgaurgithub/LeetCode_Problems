class Solution {
    public void sortColors(int[] nums) {
    int zero = 0,one = 0,two = 0;
    for(int i = 0; i < nums.length;i++){
        if(nums[i] == 0){
         zero++;
        }else if(nums[i] == 1){
            one++;
        }else{
            two++;
        }
    }
     int i = 0;
     for(int j = 0;j<zero;j++){
        nums[i++] = 0;
     }
     for(int j = 0; j < one;j++){
        nums[i++] = 1;
     }
     for(int j = 0; j < two;j++){
        nums[i++] = 2;
     }
    }
}