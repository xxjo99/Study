package linkedList;

public class LinkedList_206 {

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
	

    public ListNode reverseList(ListNode head) {
        ListNode node = null;
        
        while (head != null) {
        	ListNode temp = head;
        	head = head.next;
        	temp.next = node;
        	node = temp;
        }
        
        return node;  	
    	
    }
    


}
