public class Problem725 {
    public ListNode[] splitListToParts(ListNode head, int k){
        int count = 0;
        ListNode p = head;
        while (p != null){
            p = p.next;
            count++;
        }
        ListNode[] res = new ListNode[k];
        int size = count / k;
        int extra = count % k;
        p = head;
        for(int i = 0; i < k; i++){
            int curSize = size;
            if(extra > 0){
                extra--;
                curSize++;
            }
            ListNode dummyHead = new ListNode();
            ListNode tail = dummyHead;
            while (curSize > 0){
                tail.next = new ListNode(p.val);
                p = p.next;
                tail = tail.next;
                curSize--;
            }
            res[i] = dummyHead.next;

        }
        return res;
    }
}
