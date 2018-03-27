// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtTail(ListNode head) {
        
    if(head == null) return null;
    if(head.next == null) return null;
    
    ListNode curr = head;
    ListNode prev = curr;
    
    while(curr.next != null){
        prev = curr;
        curr = curr.next;
    }
    
    prev.next = null;

    return head;
}