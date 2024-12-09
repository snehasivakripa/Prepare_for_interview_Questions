package Matrix;

import java.util.Arrays;

public class RotateMatrix {
    public void rotate(int[][] matrix) {

        int i=0;
            for(int j=0;j<matrix[0].length;j++){
                   int temp=matrix[i][j];
                   matrix[i][j]=matrix[(matrix.length-1)][j];
                   matrix[matrix.length-1][j]=temp;
            }

        for(i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int[] row:matrix){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void main(String[] args) {
        RotateMatrix rotateMatrix= new RotateMatrix();
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix.rotate(matrix);
    }
}
