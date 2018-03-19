public static boolean validateBST(TreeNode root) {

	ArrayList<Integer> inorderVals = new ArrayLIst<Integer>();
	Stack<TreeNode> inorder = new Stack<TreeNode>();
	TreeNode currNode = root;

	while(currNode != null){
		inorder.push(currNode);
		currNode = currNode.left;
	}

	while(inorder.size() > 0){
		currNode = inorder.pop();
		inorderVals.add(currNode.data);
		if(currNode.right != null){
			currNode = currNode.right;
			while(currNode != null){
				inorder.push(currNode);
				currNode = currNode.left;
			}
		}
	}

	for(int i = 0; i < inorderVals.size() - 1; i++){
		if(inorderVals.get(i) > inorderVals.get(i+1)) return false;
	}

	return true;
}
