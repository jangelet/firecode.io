public static int singleNumber(int[] A) {
    
    Arrays.sort(A);
    
    if(A.length == 1) return A[0];
    
    if(A[0] != A[1]) return A[0];
    if(A[A.length - 1] != A[A.length - 2]) return A[A.length - 1];
    
    for(int i = 1; i < A.length - 1; i++){
        if(A[i] != A[i-1] && A[i] != A[i+1]) return A[i];
    }
    
    return 0;

}