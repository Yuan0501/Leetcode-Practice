public class Problem445 {
    public ListNode reverseList(ListNode l){
         ListNode pre = null;
         ListNode cur = l;

         while (cur != null){
             ListNode next = cur.next;
             cur.next = pre;
             pre = cur;
             cur = next;
         }
         return pre;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode re_l1 = reverseList(l1);
        ListNode re_l2 = reverseList(l2);

        int carry = 0;
        ListNode res = new ListNode();
        ListNode cur = res;

        while(re_l1 != null || re_l2 != null || carry != 0){
            int x = 0, y = 0;
            if(re_l1 != null){
                x = re_l1.val;
            }else{
                x = 0;
            }

            if(re_l2 != null){
                y = re_l2.val;
            }else {
                y = 0;
            }

            int sum = x + y + carry;
            carry = sum / 10;
            int num = sum % 10;
            ListNode node = new ListNode(num);
            cur.next = node;
            cur = cur.next;

            if(re_l1 != null){
                re_l1 = re_l1.next;
            }
            if(re_l2 != null){
                re_l2 = re_l2.next;
            }

        }

        ListNode re_res = reverseList(res.next);
        return re_res;
    }
}
