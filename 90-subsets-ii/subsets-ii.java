class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        generateSubsets(nums,0,new ArrayList<>(),result);
        return result;
    }
    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result){
        result.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1]) continue;
            current.add(nums[i]);
            generateSubsets(nums,i+1,current,result);
            current.remove(current.size()-1);
        }
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        findSums(arr, 0, 0, result);
        return result;
    }
    private static void findSums(int[] arr, int index, int currentSum, List<Integer> result) {
        if (index == arr.length) {
            result.add(currentSum);
            return;
        }
        findSums(arr, index + 1, currentSum + arr[index], result);
        findSums(arr, index + 1, currentSum, result);
    }
}