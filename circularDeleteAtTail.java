// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtTail(ListNode head) {
    
    if(head == null) return head;
    
    ListNode next = head.next;
    ListNode prev = head;
    while(next.next != head){
        prev = next;
        next = next.next;
    }
    
    prev.next = head;
    next = null;
    
    return head;

}