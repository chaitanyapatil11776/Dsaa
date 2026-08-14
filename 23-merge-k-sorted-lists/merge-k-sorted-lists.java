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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer>ss=new ArrayList<>();
        for(ListNode a:lists){
            while(a!=null){
                ss.add(a.val);
                a=a.next;
            }
        }
        Collections.sort(ss);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int a:ss){
            curr.next=new ListNode(a);
            curr=curr.next;

        }
        return dummy.next;
    }
    
}
