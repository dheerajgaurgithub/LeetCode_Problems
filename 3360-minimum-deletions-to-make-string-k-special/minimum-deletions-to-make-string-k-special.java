import java.util.*;

class Solution {
    public int minimumDeletions(String word, int k) {
        // Step 1: Count frequency of each character
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        // Step 2: Store non-zero frequencies in a list
        List<Integer> freqList = new ArrayList<>();
        for (int f : freq) {
            if (f > 0) {
                freqList.add(f);
            }
        }

        // Step 3: Sort the list
        Collections.sort(freqList);
        int n = freqList.size();
        int minDeletions = Integer.MAX_VALUE;

        // Step 4: Try making each frequency the base frequency
        for (int i = 0; i < n; i++) {
            int target = freqList.get(i);
            int deletions = 0;

            // Remove all lower frequencies completely
            for (int j = 0; j < i; j++) {
                deletions += freqList.get(j);
            }

            // Trim higher frequencies to target + k
            for (int j = i + 1; j < n; j++) {
                if (freqList.get(j) > target + k) {
                    deletions += freqList.get(j) - (target + k);
                }
            }

            // Track minimum deletions across all targets
            minDeletions = Math.min(minDeletions, deletions);
        }

        return minDeletions;
    }
}
