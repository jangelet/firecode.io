// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ListNode findMiddleNode(ListNode head) {
    
    if(head == null) return null;
    if(head.next == null) return head;

    ListNode slowPointer = head;
    ListNode nextNode = head.next;
    ListNode fastPointer = nextNode.next;
    
    if(fastPointer == null) return slowPointer;
    
    while(fastPointer.next != null){
        slowPointer = nextNode;
        nextNode = slowPointer.next;
        fastPointer = nextNode.next;
    }
    return slowPointer;
    
    // if(head == null) return null;
    //   ListNode slow = head;
    //   ListNode fast = head;
    //   while(fast!=null && fast.next != null && (fast.next).next != null  ) {
    //       slow = slow.next;
    //       fast = (fast.next).next;
    //   }
    //   return slow;   
}