// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public ArrayList<ArrayList<Integer>> printLevelByLevel(TreeNode root) {
    
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    
    if(root == null) return result;
    
    //adds arraylist to first index
    result.add(new ArrayList<Integer>());
    
    //queue tracker for level order traversal
    Queue<TreeNode> tracker = new LinkedList<>();
    tracker.add(root);
    
    //keep track of max leaves per level, and current level as index
    int levelLimit = 1;
    int levelIndex = 0;

    //level order traveral
    while(!tracker.isEmpty()){
        TreeNode curr = tracker.poll();
        //adds data result arraylist
        result.get(levelIndex).add(curr.data); 
        if(curr.left != null){ 
            tracker.add(curr.left);
        }
        if(curr.right != null){ 
            tracker.add(curr.right);
        }
        //when size of array at level index equals max number of nodes for that level,
        //increment level index, and multiply level limit by 2 (all level limits are powers of 2)
        if((result.get(levelIndex)).size() == levelLimit){ 
            levelIndex++;
            levelLimit*=2;
            //don't add a new arraylist if queue is empty, i.e. if traversal is done
            if(!tracker.isEmpty()) result.add(new ArrayList<Integer>());
        }
    }
    return result;
}