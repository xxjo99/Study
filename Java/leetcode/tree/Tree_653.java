package tree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Tree_653 {

	public class TreeNode {

		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public boolean findTarget(TreeNode root, int k) {
		if (root == null) {
			return false;
		}
		Set<Integer> set = new HashSet<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		
		while (!q.isEmpty()) {
			TreeNode node = q.poll();
			if (set.contains(k - node.val)) {
				return true;
			}
			
			set.add(node.val);
			
			if (node.left != null) {
				q.offer(node.left);
			}
			if (node.right != null) {
				q.offer(node.right);
			}
		}
		
		return false;
		
	}

}
