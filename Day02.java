//平衡二叉树
public boolean isBalance(TreeNode root) {
	if(roo == null) {
		return true;
	}
	if(maxDepth(root.left) - maxDepth(root,right) > 1 
	|| maxDepth(root.left) - maxDepth(root.right) > 1) {
                  return false;
	} 

	return isBalance(root.left) && isBalance(root.right);
}
