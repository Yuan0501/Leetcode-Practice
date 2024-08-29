//Time complexity: O(n)
//Space complesity O(1)
public class Problem21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode dummyHead = new ListNode();
        ListNode cur = dummyHead;
        while(list1 != null && list2 != null){

            if(list1 != null && list2 != null && list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else if(list1 != null && list2 != null && list1.val > list2.val){
                cur.next = list2;
                list2 = list2.next;
            }

            cur = cur.next;
        }
        if(list1 == null){
            cur.next = list2;
        }else{
            cur.next = list1;
        }
        return dummyHead.next;
    }
}
