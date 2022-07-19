package tree;

import java.util.ArrayList;
import java.util.List;

public class Tree_94 {

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

	private void recursive(TreeNode root, List<Integer> list) {
		if (root != null) {
			if (root.left != null) {
				recursive(root.left, list);
			}
			list.add(root.val);
			if (root.right != null) {
				recursive(root.right, list);
			}
		}
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		recursive(root, list);
		return list;
	}

}
