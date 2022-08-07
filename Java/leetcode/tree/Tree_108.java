package tree;

public class Tree_108 {

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
	
    public TreeNode makeBST(int[] nums, int start, int end) {
    	if (start > end) {
    		return null;
    	}
    	
    	int mid = (start + end) / 2;
    	TreeNode rootNode = new TreeNode(nums[mid]);
    	rootNode.left = makeBST(nums, start, mid-1);
    	rootNode.right = makeBST(nums, mid+1, end);
    	return rootNode;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
    	return makeBST(nums, 0, nums.length-1);
    }

}
