class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==1) return null;
        temp=head;
        int mid=size/2;
        for(int i=0;i<mid-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
