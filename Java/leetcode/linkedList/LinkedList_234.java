package linkedList;

import java.util.ArrayList;

public class LinkedList_234 {

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

	public boolean isPalindrome(ListNode head) {
		boolean answer = true;

		ArrayList<Integer> list = new ArrayList<>();

		ListNode node = head;

		while (node != null) {
			list.add(node.val);
			node = node.next;
		}

		int len = list.size();
		for (int i = 0; i < (len / 2); i++) {
			if (list.get(i).intValue() != list.get(len - i - 1).intValue()) {
				answer = false;
				break;
			}
		}

		return answer;
	}

}
