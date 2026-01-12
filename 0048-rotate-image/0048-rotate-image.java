class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] mat = new int[n][n]; 

        // creating new array (mat) and coping data
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                mat[i][j] = matrix[i][j];
            }
        }

        //rotating array -> write array in 1D and then compare indices 
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                matrix[i][j] = mat[n-1-j][i];
            }
        }
    }
}