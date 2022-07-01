package linkedList;

public class LinkedList_21 {

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

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}
		
		ListNode mergeListHead = new ListNode();
		ListNode mergeNode = mergeListHead;
		
		while (list1 != null && list2 != null) {
			
			if (list1.val < list2.val) {
				mergeNode.next = list1;
				list1 = list1.next;
			} else {
				mergeNode.next = list2;
				list2 = list2.next;
			}
			
			mergeNode = mergeNode.next;			
		}
		
		mergeNode.next = list1 == null ? list2 : list1;
		
		return mergeListHead.next;		

	}

}
