public class Problem148 {
    public ListNode sortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        ListNode res = merge(left, right);
        return res;
    }

    public ListNode merge(ListNode left, ListNode right){
        ListNode dummyHead = new ListNode();
        ListNode cur = dummyHead;
        while(left != null && right != null){
            if(left.val <= right.val){
                cur.next = left;
                left = left.next;
            }else{
                cur.next = right;
                right = right.next;
            }
            cur = cur.next;
        }
        if(left == null){
            cur.next = right;
        } else {
            cur.next = left;
        }
        return dummyHead.next;
    }
    public ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while(head != null && head.next != null){
            midPrev = (midPrev == null)? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
