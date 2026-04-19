/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0,l2=0;
        ListNode temp=headA;
        while(temp!=null){
            temp=temp.next;
            l1++;
        }
        temp=headB;
          while(temp!=null){
            temp=temp.next;
            l2++;
        }

        if(l1>l2){
            int count=l1-l2;

            while(count>0){
                headA=headA.next;
                count--;

            }
        }
        
        if(l1<l2){
            int count=l2-l1;

            while(count>0){
                headB=headB.next;
                count--;

            }
        }

        while(headA!=null  && headB!=null  && headA!=headB){
            headA=headA.next;
            headB=headB.next;


        }
        if(headA==headB)return headA;

        return null;


    
    }
}