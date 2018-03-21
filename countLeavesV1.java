public int numberOfLeaves(TreeNode root) { 
    
    //a leaf has no children, i.e. its .left and .right are null
    //so add 1 to counter everytime a node's .left and .right are null
    
    int result = 0;
    
    if(root == null) return result;
    if(root.left == null && root.right == null) return 1;
    
     Stack<TreeNode> nodes = new Stack();
     nodes.push(root);
     
     while(!nodes.isEmpty()){
        TreeNode current = nodes.pop();
        if(current.right == null && current.left == null) result++;
        
		if (current.right != null) {
			nodes.push(current.right);
		}
		if(current.left != null) {
			nodes.push(current.left);
		}
     }
     
     return result;
}