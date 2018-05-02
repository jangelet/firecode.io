public static void rotateSquareImageCW(int[][] matrix) {
    for(int i = 0; i < matrix.length; i++){
        for(int j = i; j < matrix.length; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
    
    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix.length - 1; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;       
        }
    }
}