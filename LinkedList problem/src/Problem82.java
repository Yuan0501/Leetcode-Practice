//Time complexity: O(n)
//Space complexity: O(1)
public class Problem82 {
    public ListNode deleteDuplicates(ListNode head){
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = head;
        ListNode pre = dummyHead;
        while(cur != null){
           if(cur.next != null && cur.val == cur.next.val){
               while(cur.next != null && cur.val == cur.next.val){
                   cur = cur.next;
               }
               pre.next = cur.next;
           }else{
               pre = pre.next;
           }
           cur = cur.next;

        }
        return dummyHead.next;
    }
}
