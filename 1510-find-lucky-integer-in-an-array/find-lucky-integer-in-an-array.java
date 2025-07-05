class Solution {
    public int findLucky(int[] arr) {
         int lucky = -1;

        for (int i = 0; i < arr.length; i++) {
            int store = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == store) {
                    count++;
                }
            }
            if (count == store) {
                lucky = Math.max(lucky, store); 
            }
        }

        return lucky; 
    }
}