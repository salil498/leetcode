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
        if (head.next == null && n==1) return null;
        ListNode listNode = new ListNode(-1);
        listNode.next = head;
        ListNode right = listNode;
        ListNode left = listNode;
        while(right.next!=null){
            right=right.next;
            n--;
            if(n<0)
                left=left.next;
        }
        if(left.next==head)
            return head.next;
        left.next= left.next.next;
        return head;
    }
}
