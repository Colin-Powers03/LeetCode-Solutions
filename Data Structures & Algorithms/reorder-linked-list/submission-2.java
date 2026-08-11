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
    public void reorderList(ListNode head) {
        // Finds middle of the linked list.
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // Reverses second half of linked list.
        ListNode second = slow.next;
        ListNode prev = null;
        slow.next = null;
        ListNode next = second;
        while(second != null) {
            next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }
        // Alternate between first half & second half nodes.
        ListNode first = head;
        second = prev;
        while(second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}