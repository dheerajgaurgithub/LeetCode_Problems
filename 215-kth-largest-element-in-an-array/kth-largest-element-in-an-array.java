class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> res=new PriorityQueue<>();
        for(int num:nums){
            res.add(num);
            if(res.size()>k){
                res.poll();
            }
        }
        return res.peek();
    }
}