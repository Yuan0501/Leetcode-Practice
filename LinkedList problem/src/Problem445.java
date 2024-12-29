import java.util.Stack;

public class Problem445 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        Stack<ListNode> s1 = buildstack(l1);
        Stack<ListNode> s2 = buildstack(l2);
        ListNode dummyhead = new ListNode();

        int carry = 0;
        while (!s1.isEmpty() || !s2.isEmpty()|| carry != 0){
            int sum = 0;
            if(s1.isEmpty() && !s2.isEmpty()){
                ListNode node2 = s2.pop();
                sum = node2.val;
            } else if (!s1.isEmpty() && s2.isEmpty()) {
                ListNode node1 = s1.pop();
                sum = node1.val;
            }else if(!s1.isEmpty() && !s2.isEmpty()){
                ListNode node1 = s1.pop();
                ListNode node2 = s2.pop();
                sum = node1.val + node2.val;
            }
            ListNode cur = new ListNode();
            int val = (sum + carry) % 10;
            carry = (sum + carry) / 10;
            cur.val = val;
            cur.next = dummyhead.next;
            dummyhead.next = cur;
        }
        return dummyhead.next;
    }

    public Stack<ListNode> buildstack(ListNode l){
        Stack<ListNode> stack = new Stack<>();
        while (l != null) {
            stack.push(l);
            l = l.next;
        }
        return stack;
    }
}
