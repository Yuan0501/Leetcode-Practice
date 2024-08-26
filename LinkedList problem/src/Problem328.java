public class Problem328 {
    public ListNode oddEvenList(ListNode head){
        ListNode odd_head = new ListNode();
        ListNode odd = odd_head;
        ListNode even_head = new ListNode();
        ListNode even = even_head;
        int i = 1;
        while(head != null){
            if(i%2 == 1){
                odd.next = head;
                odd = odd.next;
            }else{
                even.next = head;
                even = even.next;
            }
            i+= 1;
            head = head.next;
        }
        even.next = null;
        odd.next = even_head.next;
        return odd_head.next;
    }
}
