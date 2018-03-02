// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void flipItVerticalAxis(int[][] matrix) {
    
    int temp = 0;
    
    int len = matrix.length;
    int rowLen = matrix[0].length;
    
    for(int row = 0; row < len; row++){
        for(int col = 0; col < rowLen - 1; col++){
            temp = matrix[row][col];
            matrix[row][col] = matrix[row][rowLen - 1 - col];
            matrix[row][rowLen - 1 - col] = temp;
        }
    }
    
}