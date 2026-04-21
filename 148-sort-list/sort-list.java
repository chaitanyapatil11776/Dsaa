class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    ListNode mergeSort(ListNode node) {

        // Base case
        if (node == null || node.next == null) {
            return node;
        }

        // Find middle
        ListNode prev = null;
        ListNode slow = node;
        ListNode fast = node;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Break list into two halves
        prev.next = null;

        // Recursively sort both halves
        ListNode p1 = mergeSort(node);
        ListNode p2 = mergeSort(slow);

        // Merge sorted lists
        return merge(p1, p2);
    }

    ListNode merge(ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (h1 != null && h2 != null) {
            if (h1.val <= h2.val) {
                curr.next = h1;
                h1 = h1.next;
            } else {
                curr.next = h2;
                h2 = h2.next;
            }
            curr = curr.next;
        }

        if (h1 != null) curr.next = h1;
        if (h2 != null) curr.next = h2;

        return dummy.next;
    }
}