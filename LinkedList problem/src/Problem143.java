//Time complexity: O(n)
//Space complexity: O(1)
public class Problem143 {
    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode dummyhead = new ListNode();
        ListNode p = dummyhead;
        dummyhead.next = head;
        while(fast != null && fast.next != null){
            p = p.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        p.next = null;
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    public void reorderList(ListNode head){
        ListNode mid = getMid(head);
        ListNode reverseNode = reverse(mid);
        ListNode p1 = head;
        ListNode p2 = reverseNode;
        ListNode dummyhead = new ListNode();
        ListNode cur = dummyhead;
        while(p1 != null && p2 != null){
            cur.next = p1;
            p1 = p1.next;
            cur = cur.next;
            cur.next = p2;
            p2 = p2.next;
            cur = cur.next;
        }
        if(p1 != null){
            cur.next = p1;
        }else{
            cur.next = p2;
        }


    }
}
