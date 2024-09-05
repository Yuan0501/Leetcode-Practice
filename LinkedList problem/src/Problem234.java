public class Problem234 {
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

    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while (fast != null && fast.next != null){
            cur = cur.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        cur.next = null;
        return slow;
    }
    public boolean isPalindrome(ListNode head){
        ListNode half = getMid(head);
        ListNode reverse = reverse(half);
        ListNode p1 = head;
        ListNode p2 = reverse;

        while (p2 != null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;

        }

        return true;
    }
}
