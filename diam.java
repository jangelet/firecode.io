// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public int diameter(TreeNode root) {
    
    if(root == null) return 0;
    
    TreeNode curr = root;
    
    int a = findMinHeight(root);
    int b = findHeight(root);

    while(curr.next != null){
        curr = curr.next;
        if(findHeight(curr) > b) b = findHeight(curr);
    }

    return a + b - 1;


}

public int findMinHeight(TreeNode root) {
        /* base case tree is empty */
        if(root == null) return 0;
        /* If tree is not empty then height = 1 + max of left
            height and right heights */
        return 1 + Math.min(findHeight(root.left), findHeight(root.right));    
}   