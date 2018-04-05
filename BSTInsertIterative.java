public TreeNode insert(TreeNode root, int data) { 

    if(root == null) root = new TreeNode(data, null, null);
            
    TreeNode curr = root;
    
    while(curr != null){
        TreeNode prev = curr;
        if(curr.data < data){
            curr = curr.right;
            if(curr == null && prev.data != data){
               prev.right = new TreeNode(data, null, null);
               break;
            } 
        }else if(curr.data >= data){
            curr = curr.left;
            if(curr == null && prev.data != data){ 
                prev.left = new TreeNode(data, null, null);
                break;
            }
        }
    }

    return root;
}