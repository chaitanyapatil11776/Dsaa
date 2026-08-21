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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prv=list1;
        ListNode aft=list1;
        for(int i=1;i<a;i++){
            prv=prv.next;

        }
        for(int i=0;i<=b;i++){
            aft=aft.next;
        }
        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;

        }
        prv.next=list2;
        temp.next=aft;
        return list1;
    }
}