// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void flipItVerticalAxis(int[][] matrix) {
    
    int temp = 0;
    
    // for(int i = 0; i < matrix.length; i++){
    //     for(int j = 0; j < matrix.length; j++){
    //         temp = matrix[i][j];
    //         matrix[i][j] = matrix[i][matrix.length - 1 - j];
           
    //         matrix[i][matrix.length - 1 - j] = temp;
    //     }
    // }
    
    for(int i = 0; i < matrix[0].length; i++){
        temp = matrix[i][0];
        matrix[i][0] = matrix[i][matrix[0].length - 1];
        matrix[i][matrix[0].length - 1] = temp;
    }
    
}