public TreeNode findNode(TreeNode root, int val){

	if(root == null) return null;
	if(root.data == val) return root;

	Stack<TreeNode> nodes = new Stack();
	nodes.push(root);

	while(nodes.size() > 0){
		TreeNode currNode = nodes.pop();
		if(currNode.data == al) return currNode;
		if(currNode.right != null){
			nodes.push(currNode.right);
		}
		if(currNode.left != null){
			nodes.push(currNode.left);
		}
	}
	return null;
}
