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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        int count=0;
        while( count<k){
            if(temp==null)return head;
              temp=temp.next;
        count++;
        }
        ListNode prv= reverseKGroup(temp,k);
        ListNode curr=head;
        while(count-->0){
            ListNode next=curr.next;
            curr.next=prv;
            prv=curr;
            curr=next;
        }
        return prv;




      

    }
}