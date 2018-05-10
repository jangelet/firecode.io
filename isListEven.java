public Boolean isListEven(ListNode head) {
    
    //traverse linked list, incrementing 1 at each loop until tail is reached
    ListNode curr = head;
    int counter = 0;
    
    while(curr != null){
        counter++;
        curr = curr.next;
    }
    
    return (counter%2 == 0);
    
}