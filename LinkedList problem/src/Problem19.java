public class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummyHead = new ListNode();

        ListNode p = dummyHead, q = dummyHead;
        for(int i = 0; i < n + 1; i++){
            q = q.next;
        }
        while(q != null){
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return head;
    }
}
