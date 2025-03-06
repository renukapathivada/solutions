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
        ListNode a=head;
        ListNode b=head;
        int c=1;
        while(a.next!=null){
            a=a.next;
            c++;
        }
        if(c==n){
            return head.next;
        }
        for(int i=0;i<c-n-1;i++){
            b=b.next;
        }
        b.next=b.next.next;
        return head;
    }
}