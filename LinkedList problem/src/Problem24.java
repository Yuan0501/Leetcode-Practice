public class Problem24 {
    public ListNode swapPairs(ListNode head){
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = dummyHead;
        if(head == null){
            return null;
        }
        while(cur.next != null && cur.next.next != null){
            ListNode node1 = cur.next;
            ListNode node2 = cur.next.next;
            ListNode next = node2.next;

            node2.next = node1;
            node1.next = next;
            cur.next = node2;
            cur = node1;
        }
        return dummyHead.next;
    }
}
