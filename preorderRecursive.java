ArrayList<Integer> preorderedList = new ArrayList<Integer>();
public void preorder(TreeNode root) {
   
    if(root != null){
        preorderedList.add(root.data);
        preorder(root.left);
        preorder(root.right);
    }

}