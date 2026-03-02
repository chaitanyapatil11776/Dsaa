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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return null;
     ListNode prv=head;
        ListNode curr=head.next;
        while(curr!=null){
            if(prv.val==curr.val){
                prv.next=curr.next;
                curr=curr.next;
            }else{
                prv=curr;
                curr=curr.next;
            }
        }
        return head;
    }
}