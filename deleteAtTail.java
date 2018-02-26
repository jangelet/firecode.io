// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtTail(ListNode head) {
        
    if(head == null) return null;
  
    ListNode currNode = head;
    ListNode nextNode = head.next;
    
    if(nextNode == null) head = null;
    
    while(currNode.next != null){
        if(nextNode.next == null){
            currNode.next = null;
        }else{
            currNode = currNode.next;
            nextNode = nextNode.next;
        }
    }
    
    return head;
}