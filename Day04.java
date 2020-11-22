public void maxDepth(TreeNode root) {
	if(root == null) {
		return 0;
	}
	int leftTree = maxDepth(root.left);
	int rightTree = maxDepth(root.right);
    if(leftTree > rightTree) {
    	return leftTree + 1;
    }else {
    	return rightTree;
    }
}