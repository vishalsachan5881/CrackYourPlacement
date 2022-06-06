/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        while(n>=0){
            if(fast == null)
                break;
            fast=fast.next;
            n--;
            
        }
        if(fast == null && n>=0)
            return head.next;
        
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next  = slow.next.next;
        return head;
    }
}