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
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode (0);
        ListNode higher=new ListNode (0);
        ListNode smallhead=small;
        ListNode highhead=higher;
        while(head!=null){
            if(head.val<x){
                smallhead.next=head;
                smallhead=smallhead.next;
            }else{
              
                highhead.next=head;
                highhead=highhead.next;
            
            }
            head=head.next;
        }
        highhead.next=null;
        smallhead.next=higher.next;
return small.next;


    }
}