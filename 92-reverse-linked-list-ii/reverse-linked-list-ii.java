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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode leftprv=dummy;
        ListNode curr=head;
        for(int i=0;i<left-1;i++){
            leftprv=leftprv.next;
            curr=curr.next;

            
        }
        ListNode subp=curr;
        ListNode prv=null;
        for(int i=0;i<=right-left;i++){
            ListNode next=curr.next;
            curr.next=prv;
            prv=curr;
            curr=next;
        }

        leftprv.next=prv;
        subp.next=curr;
        return dummy.next;




    }
}