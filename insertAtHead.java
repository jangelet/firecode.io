// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode insertAtHead(ListNode head, int data) {
    
            if(head == null){
                head = new ListNode(data);
            }else{
                ListNode prev = head;
                head = new ListNode(data);
                head.next = prev;
            }
            
            return head;
}