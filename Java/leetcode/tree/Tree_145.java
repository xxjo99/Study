package tree;

import java.util.ArrayList;
import java.util.List;

public class Tree_145 {

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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }
    
    private void postorder(TreeNode node, List<Integer>list) {
    	if (node == null) {
    		return;
    	}
    	
    	postorder(node.left, list);
    	postorder(node.right, list);
    	list.add(node.val);
    }

}
