public ListNode deleteAtMiddle(ListNode head, int position) {
    
    if(head == null) return null;
    
    int tracker = 1;
    
    if(position == 1){
        head = head.next;
        return head;
    }
    
    if(head.next == null) return null;
    
    ListNode prev = head;
    ListNode nextNode = head.next;
    tracker++;
    
    while(nextNode != null){
        if(position == tracker){
            prev.next = nextNode.next;
        }
        prev = nextNode;
        nextNode = nextNode.next;
        tracker++;
    }
    
    return head;
}