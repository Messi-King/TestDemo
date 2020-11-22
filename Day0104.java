//是否是子树
public booean ChildTree(TreeNode a,TreeNode b) {
	if(a == null && b == null) {
		return false;
	}
	if(isSameTree(a,b)) {
		return true;
	}
	if(isSameTree(a.left,b)) return true;
	if(isSameTree(a.right,b)) return true;
	return false;
}