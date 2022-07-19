package linkedList;

public class LinkedList_83 {

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

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return head;
		}
		
		ListNode prev = head;
		ListNode cur = head.next;
		
		while (cur != null) {
			if (prev.val == cur.val) {
				prev.next = cur.next;
				cur = prev;
			}
			
			prev = cur;
			cur = cur.next;
		}
		
		return head;

	}

}
