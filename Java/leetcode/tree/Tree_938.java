package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree_938 {

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

    public int rangeSumBST(TreeNode root, int low, int high) {
    	
    	TreeNode rootNode = root;
    	Queue<TreeNode> queue = new LinkedList<>();
    	queue.offer(rootNode);
    	int sum = 0;
    	
    	while (!queue.isEmpty()) {
    		TreeNode node = queue.poll();
    		
    		if (node.val >= low && node.val <= high) {
    			sum += node.val;
    		}
    		
    		if (node.left == null && node.right == null) {
    			continue;
    		} else if(node.left != null && node.right != null) {
    			queue.offer(node.left);
    			queue.offer(node.right);
    		} else if (node.left != null) {
                queue.offer(node.left);
            } else if (node.right != null) {
                queue.offer(node.right);
            }
    	}
    	
    	return sum;
        
    }

}
