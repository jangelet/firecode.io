public int size(TreeNode root) {
	if(root == null) return 0;
	return size(root.right) + 1 + size(root.left);
}
