// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode deleteAtHead(ListNode head) {
    if(head != null){
        head = head.next;
        return head;
    }else{
        return null;
    }
}