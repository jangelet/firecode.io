// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode insertAtTail(ListNode head, int data) {
    
    if(head == null){
        head = new ListNode(data);
        return head;
    } 
    
    ListNode prev = head;
    ListNode next = head.next;
    while(next != null){
        prev = next;
        next = prev.next;
    
    }
    
    prev.next = new ListNode(data);
    
    return head;

}