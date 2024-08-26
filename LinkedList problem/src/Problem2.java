public class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode res = new ListNode();
        ListNode cur = res;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int x = 0,y = 0;
            if(l1 != null){
                 x = l1.val;
            }else {
                 x = 0;
            }
            if(l2 != null){
                 y = l2.val;
            }else{
                 y = 0;
            }
            int sum = x + y + carry;
            carry = sum / 10;
            int num = sum % 10;
            ListNode newNode = new ListNode(num);
            cur.next = newNode;
            cur = cur.next;

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }
        return res.next;
    }
}
