//前序遍历
public List<Integer> preorder(TreeNode root) {
	List<Integer> ret = new ArrayList<>();
	if(root == null) return ret;
    ret.add(root.val)
    List<Integer> left = preorder(root.left);
    ret.addAll(left);
    List<Integer> right = preorder(root.right);
    ret.addAll(right);
    return ret;
}