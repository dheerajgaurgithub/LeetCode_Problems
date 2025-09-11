public class Solution {
    public int FindKthLargest(int[] nums, int k) {
        PriorityQueue<int,int> res=new PriorityQueue<int,int>();
        foreach(int num in nums){
            res.Enqueue(num,num);
            if(res.Count>k){
                res.Dequeue();
            }
        }
        return res.Peek();
    }
}