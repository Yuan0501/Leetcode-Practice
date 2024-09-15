import java.util.Comparator;
import java.util.PriorityQueue;
//Time complexity: O(NlogK)
//Space complexity: O(N)
public class Problem23 {

    public ListNode mergeKLists(ListNode[] lists){

        ListNode head = new ListNode();
        ListNode point = head;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                new Comparator<ListNode>(){
            @Override
            public int compare(ListNode l1, ListNode l2){
                if(l1.val > l2.val){
                    return 1;
                } else if (l1.val == l2.val) {
                    return 0;
                }else{
                    return -1;
                }
            }
        });
//Time complexity: O(k)
        for(ListNode node : lists){
            if(node != null) {
                pq.add(node);
            }
        }

//Total Time complexity is O(Nlogk)
        while(!pq.isEmpty()){
// pq.poll() Time Complexity: O(logk) k is nums of linkedlist
            ListNode node = pq.poll();
// point.next Time complexity: O(N) N is nums of nodes
            point.next = node;
            point = point.next;
            if(point.next != null){
                pq.add(point.next);
            }
        }

        return head.next;

    }
}
