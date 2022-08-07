package tree;

import java.util.ArrayList;
import java.util.List;

public class Tree_144 {

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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }
    
    private void preorder(TreeNode node, List<Integer>list) {
    	if (node == null) {
    		return;
    	}
    	
    	list.add(node.val);
    	preorder(node.left, list);
    	preorder(node.right, list);
    }

}
