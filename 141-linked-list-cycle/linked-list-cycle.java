/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode A=head;
        ListNode B=head;
        while(A!=null&&A.next!=null){
            A=A.next.next;
            B=B.next;
            if(A==B){
                return true;
            }
        }
        return false;
    }
}