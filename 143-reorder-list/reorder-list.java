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
    ListNode rev(ListNode head){
        ListNode curr=head,next=null,prv=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prv;
            prv=curr;
            curr=next;
        }
        return prv;

    }

    public void reorderList(ListNode head) {
ListNode     slow=head,fast=head;
while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
}
ListNode sec=rev(slow.next);
slow.next=null;
ListNode first=head;
while(sec!=null){
    ListNode temp1=first.next;
    ListNode temp2=sec.next;

    first.next=sec;
    sec.next=temp1;
    first=temp1;
    sec=temp2;
}

    }
}