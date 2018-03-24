//this answer is inadequate. Doesn't work if right subtree is > left

public int findHeight(TreeNode root) { 
    
    if(root == null) return 0;
    if(root.left == null && root.right == null) return 1;
    
    return 1 + findHeight(root.left);

}