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
    public boolean isPalindrome(ListNode head) {
       int len =  0;
        List<Integer> ls = new ArrayList<>();
        ListNode ptr = head;
        while(ptr!=null){
            ls.add(ptr.val);
            ptr = ptr.next;
        }
        int i = 0 , j = ls.size()-1;
        while(i < j)
        {
            if(ls.get(i) != ls.get(j)) return false;
            i++;
            j--;
        }
        return true;
        
    }
}