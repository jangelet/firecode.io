public int sum(TreeNode root) { 
    
    if(root == null) return 0;

    return root.data + sum(root.left) + sum(root.right);
}
