public class Problem109 {
    public TreeNode sortedListToBST(ListNode head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return new TreeNode(head.val);
        }
        ListNode node = preMid(head);
        ListNode mid = node.next;
        TreeNode root = new TreeNode(mid.val);
        node.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        return root;
    }

    public ListNode preMid(ListNode head){
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            pre = pre.next;
        }
        return pre;
    }
}
