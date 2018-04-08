// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public DoublyLinkedNode insertAtPos(DoublyLinkedNode head, int data, int pos) {
    
    DoublyLinkedNode new_node = new DoublyLinkedNode(data);
    
    if(head == null && pos > 1) return null;
    
    if(head == null && pos == 1) return new_node;
    
    int curr_pos = 1;
    
    DoublyLinkedNode temp = head;
    
    //if target position is head and LL isn't empty
    if(pos == 1){
        new_node.next = temp;
        temp.prev = new_node;
        return new_node;
    }
    
    //traverses list until curr_pos equals target position, or tail is reached
    while(curr_pos != pos && temp.next != null){
        temp = temp.next;
        curr_pos++;
    }
    
    //if target position is immediately after tail
    if(curr_pos + 1 == pos){
        temp.next = new_node;
        new_node.prev = temp;
        return head;
    //if target position is between head and tail
    }else if(curr_pos == pos){
        new_node.next = temp;
        new_node.prev = temp.prev;
        temp.prev.next = new_node;
        temp.prev = new_node;
        return head;
    //if target position is outside bounds
    }else{
        return head;
    }

}