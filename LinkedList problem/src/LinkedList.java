public class LinkedList {

    ListNode head;
    int size;

    public LinkedList(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void addFirst(int val){
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        size++;
   }
   public void addLast(int val){
        ListNode node = new ListNode(val);
        if(head == null){
            head = node;
        }else{
            ListNode p = head;
            while( p.next != null){
                p = p.next;
            }
            p.next = node;
        }
        size++;
   }

    public String toString(ListNode head){
        StringBuilder sb = new StringBuilder();
        ListNode cur = head;
        while(cur != null){
            sb.append(cur.val);
            sb.append("->");
            cur = cur.next;
        }
        return sb.toString();
    }
}
