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
        ListNode next=null;
        ListNode prv=null;
        ListNode curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prv;
            prv=curr;
            curr=next;
        }
        return prv;
    }
    public void reorderList(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode sec=rev(s.next);
        s.next=null;

        ListNode first=head;
        while(sec!=null){
            ListNode f1=first.next;
            ListNode f2=sec.next;
            first.next=sec;
            sec.next=f1;
            first=f1;
            sec=f2;


        }

    }
}