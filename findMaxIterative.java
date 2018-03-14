public int findMax(TreeNode root){
	if(root == null) return 0;

	int result = root.data;

	Queue<TreeNode> nodes new LinkedList<TreeNode>();
	nodes.add(root);

	while(nodes.size() > 0){
		TreeNode currMax = nodes.remove();
		if(currMax.data > result) result = currMax.data;
		if(currMax.left != null){
			nodes.add(currMax.left);
		}
		if(currMax.right != null){
			nodes.add(currMax.right);
		}
	}
	return result;
}
