public class Problem92 {
    public ListNode reverseBetween(ListNode head, int left, int right){
        ListNode preLeftNode = null;
        ListNode leftNode = head;

        if (right == 1 && left == 1){
            return head;
        }


        while(left > 1){
            preLeftNode = leftNode;
            leftNode = leftNode.next;
            left--;
            right--;
        }

        ListNode reverseCurNode = leftNode;
        ListNode reversePreNode = preLeftNode;


        ListNode reverseNextNode = null;
        while(right > 0){
            reverseNextNode = reverseCurNode.next;
            reverseCurNode.next = reversePreNode;
            reversePreNode = reverseCurNode;
            reverseCurNode = reverseNextNode;
            right--;
        }

        if(preLeftNode != null){
            preLeftNode.next = reversePreNode;
        }else{
            head = reversePreNode;
        }

        leftNode.next = reverseCurNode;
        return head;

    }
}
