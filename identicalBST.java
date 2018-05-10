// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public boolean isIdentical(TreeNode root1, TreeNode root2) {
    
    if(root1 == null && root2 == null) return true; 
    if((root1 != null && root2 == null) || (root1 == null && root2 != null) ||
    (root1.left != null && root2.left == null) || (root1.left == null && root2.left != null) ||
    (root1.right != null && root2.right == null) || (root1.right == null && root2.right != null)) return false;
    
    return (root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right));

}