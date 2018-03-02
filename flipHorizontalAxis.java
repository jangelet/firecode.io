// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static void flipHorizontalAxis(int[][] matrix) {
    int[] temp = new int[matrix[0].length];
    
    for(int i = 0; i < matrix.length - 1; i++){
        for(int j = matrix.length - 1; j > 0; j--){
            temp = matrix[i];
            System.out.println("i: " + i + " j: " + j);
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
        }
    }
}