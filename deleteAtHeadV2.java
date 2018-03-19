public ListNode deleteAtHead(ListNode head){\

	if(head == null || head.next == null) return null;

	head = head.next;

	return head;

}
