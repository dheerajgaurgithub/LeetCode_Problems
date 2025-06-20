import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include current element
        current.add(nums[index]);
        generateSubsets(nums, index + 1, current, result);

        // Exclude current element
        current.remove(current.size() - 1);
        generateSubsets(nums, index + 1, current, result);
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

        // Include current element
        findSums(arr, index + 1, currentSum + arr[index], result);

        // Exclude current element
        findSums(arr, index + 1, currentSum, result);
    }
}
