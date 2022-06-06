public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode xA = headA , xB = headB;
      while(xA != xB) {
        xA = xA == null ? headB : xA.next;
        xB = xB == null ? headA : xB.next;
      }
      return xA;
    }
}