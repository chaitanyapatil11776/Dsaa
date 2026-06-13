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
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;

        }
        ListNode prv=null;
        ListNode next=null;
        while(s!=null){
            next=s.next;
            s.next=prv;
            prv=s;
            s=next;
     
        }
        while(prv!=null){
            if(prv.val!=head.val){
                return false;
            }head=head.next;
            prv=prv.next;
        }
        return true;
    }
}