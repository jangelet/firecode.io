public ArrayList<Integer> preorderItr(TreeNode root) {

	ArrayList<Integer> preorderedList = new ArrayList<Integer>();

	if(root == null) return preorderedList;

	Stack<TreeNode> nodes = new Stack<>();
	nodes.push(root);

	while (!nodes.isEmpty()) {
		TreeNode current = nodes.pop();
		preorderedList.add(current.data);

		if (current.right != null) {
			nodes.push(current.right);
		}
		if(current.left != null) {
			nodes.push(current.left);
		}
	}

	return preorderedList;
}
