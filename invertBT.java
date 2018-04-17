private static void invert(BinaryTreeNode root){
    
    Queue<BinaryTreeNode> qTracker = new LinkedList<BinaryTreeNode>();
    qTracker.add(root);
    
    while(!qTracker.isEmpty()){
        BinaryTreeNode curr = qTracker.poll();
        BinaryTreeNode temp = curr.left;
        curr.left = curr.right;
        curr.right = temp;
        if(curr.left != null) qTracker.add(curr.left);
        if(curr.right != null) qTracker.add(curr.right);
    }

}