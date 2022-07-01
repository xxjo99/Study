package linkedList;

public class LinkedList_876 {

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
	

    public ListNode middleNode(ListNode head) {
    	int nodeCnt = 0;
    	ListNode node = head;
    	
    	while (node != null) {
    		nodeCnt++;
    		node = node.next;
    	}
    	
    	int mid = nodeCnt / 2 + 1;
    	node = head;
    	
    	for (int i = 1; i < mid; i++) {
    		node = node.next;
    	}
    	
    	return node;    	
    	
    }
    


}
