package tree;

public class Tree_100 {

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

	public boolean check(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}
		else if (left == null || right == null) {
			return false;
		}
		
		if (left.val == right.val) {
			return check(left.right, right.left) && check(left.left, right.right);
		} else {
			return false;
		}
		
	}

	public boolean isSymmetric(TreeNode root) {
		TreeNode left = root.left;
		TreeNode right = root.right;

		return check(left, right);

	}

}
