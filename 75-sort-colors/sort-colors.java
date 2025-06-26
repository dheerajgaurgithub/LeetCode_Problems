class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Count occurrences
        for (int num : nums) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }

        // Overwrite array with counted values
        int index = 0;

        while (count0-- > 0) nums[index++] = 0;
        while (count1-- > 0) nums[index++] = 1;
        while (count2-- > 0) nums[index++] = 2;

        // Print result
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
