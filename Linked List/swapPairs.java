class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next=head;
        ListNode current = dummyNode;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            second.next =first;
            current.next = second;
            current=first;
        }
        return dummyNode.next;

    }
}
