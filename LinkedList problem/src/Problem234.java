public class Problem234 {

    public boolean isPalindrome(ListNode head){
        ListNode mid = getMid(head);
        ListNode half = reverse(mid);
        ListNode p1 = head;
        ListNode p2 = half;
        while (p1 != null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public ListNode getMid(ListNode head){
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cut = dummyHead;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            cut = cut.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        cut.next = null;
        return slow;
    }

    public ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
