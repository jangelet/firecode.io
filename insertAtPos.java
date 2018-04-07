// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public DoublyLinkedNode insertAtPos(DoublyLinkedNode head, int data, int pos) {
    
    //cycle through LL using two tracker variables, increment curr_pos, when curr_pos == pos
        //create new node with data, have prev pointer next point new node, curr node prev point to new node
    
    int curr_pos = 1;
    DoublyLinkedNode n_node = new DoublyLinkedNode(data);
    
    if(head == null && pos > 1) return head;
    
    if(head == null && pos == 1) return n_node;
    
    if(pos == 1){
        head = n_node;
        return head;
    }
    
    DoublyLinkedNode curr = head;
    
    while(pos != curr_pos){
        curr_pos++;
        DoublyLinkedNode prev = curr;
        if(curr.next != null) curr = curr.next;
        if(pos == curr_pos){
            // if(curr != head){
            //     n_node.next = curr;
            // }else if(curr.next = null){
            //     n_node.next = null;
            // }
            n_node.next = curr;
            n_node.prev = prev;
            prev.next = n_node;
            if(curr.prev != null) curr.prev = n_node;
        }
        
    }
    
    return head; 
    
}