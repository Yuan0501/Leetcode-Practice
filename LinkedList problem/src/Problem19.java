public class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode fast = dummyHead;
        ListNode slow = dummyHead;
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;

    }
}
