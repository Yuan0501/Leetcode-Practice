//Time complexity: O(n^2)
//Spce complexity: O(1)
public class Problem147 {
    public ListNode insertionSortList(ListNode head){
        ListNode dummyHead = new ListNode();
        ListNode cur = head;

        while(cur != null){
            //Using a prev node to traverse everynode that is smaller than the current node
            ListNode prev = dummyHead;
            while (prev.next != null && prev.next.val <= cur.val){
                prev = prev.next;
            }

             //save the node next to the current node
            ListNode next = cur.next;

            //prev -> cur -> next
            cur.next = prev.next;
            prev.next = cur;
            cur = next;
        }
        return dummyHead.next;
    }
}
