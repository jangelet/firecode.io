// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ArrayList<Integer> levelorder(TreeNode root) {
    
    if(root == null) return null;
    
    ArrayList<Integer> result = new ArrayList<Integer>();
    Queue<TreeNode> tracker = new LinkedList<>();
    
    tracker.add(root);
    
    while(!tracker.isEmpty()){
        TreeNode curr = tracker.poll();
        result.add(curr.data);
        if(curr.left != null){
            tracker.add(curr.left);
        }
        if(curr.right != null){
            tracker.add(curr.right);
        }
    }
    return result;
}