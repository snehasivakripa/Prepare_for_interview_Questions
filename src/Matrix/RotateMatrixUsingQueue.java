package Matrix;

import java.util.*;

public class RotateMatrixUsingQueue {
    public void rotate(int[][] matrix) {
        Queue<Integer> queue=new LinkedList<>();
        if(matrix.length==0 || matrix[0].length==0){
            return;
        }
        for(int j=0;j<=matrix[0].length-1;j++){
            for (int i=matrix.length-1;i>=0;i--){
                queue.offer(matrix[i][j]);
            }
        }
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<=matrix[0].length-1;j++){
               matrix[i][j]=queue.poll();
            }
        }
        for(int[] row:matrix){
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        RotateMatrixUsingQueue rotateMatrix= new RotateMatrixUsingQueue();
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix.rotate(matrix);
    }
}
