// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void transposeMatrix(int[][] matrix) {
    //rows become cols
    //row 0 becomes col 0
    //row 1 becomes col 1
    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix.length; j++){
            if(i >= 1 && j == 0) j = 1;
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
        i++;
    }
}