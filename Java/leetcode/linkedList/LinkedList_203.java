package linkedList;

public class LinkedList_203 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {

		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

	}

    public ListNode removeElements(ListNode head, int val) {
    	ListNode root  = new ListNode(0);
    	root.next = head;
    	ListNode current = root;
    	
    	while (current.next != null) {
    		
    		if (current.next.val != val) {
    			current = current.next;
    			
    		} else {
    			current.next = current.next.next;
    		}
    	}
    	
    	return root.next;
    	
    	
    }

}
