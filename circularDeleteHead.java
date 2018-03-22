// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtHead(ListNode head) {
                
    if(head == null || head.next == head) return null;
    ListNode curr = head;

    while(curr.next != head){
        curr = curr.next;
    }

    curr.next = head.next;
    head.next = null;
    head = curr.next;

   return head;
   
}