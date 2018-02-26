// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int singleNumber(int[] A) {
    
    if(A.length < 3) return A[0];
    
    HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
    
    for(int i = 0; i < A.length; i++){
        if(counter.get(A[i]) == null){
            counter.put(A[i], 1);
        }else{
            counter.put(A[i], counter.get(A[i]) + 1);
        }
    }
    
    for(int i = 0; i < A.length; i++){
        if(counter.get(A[i]) == 1) return A[i];
    }
    
    return A[0];
}