public class Problem203 {
    public ListNode removeElements(ListNode head, int val){
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while(cur != null && cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return dummyHead.next;
    }
}
