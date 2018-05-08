// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ArrayList<ArrayList<Integer>> printLevelByLevel(TreeNode root) {
               
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    
    if(root == null) return result;
    
    result.add(new ArrayList<Integer>());
    
    Queue<TreeNode> tracker = new LinkedList<>();
    
    tracker.add(root);
    
    int levelLimit = 1;
    int levelIndex = 0;

    while(!tracker.isEmpty()){
        TreeNode curr = tracker.poll();
        result.get(levelIndex).add(curr.data); 
        if(curr.left != null){ 
            tracker.add(curr.left);
        }
        if(curr.right != null){ 
            tracker.add(curr.right);
        }
          if((result.get(levelIndex)).size() == levelLimit){ 
            levelIndex++;
            levelLimit*=2;
            if(!tracker.isEmpty()) result.add(new ArrayList<Integer>());
        }
    }

    return result;

}