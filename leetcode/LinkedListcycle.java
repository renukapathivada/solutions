/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode a = head;
        ListNode b = head;
        while (a != null && a.next != null) {
            b = b.next;
            a = a.next.next;
            if (a == b) {
                return true;
            }
        }
        return false;
    }
}