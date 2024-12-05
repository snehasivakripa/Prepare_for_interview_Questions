package Matrix;


import java.util.Arrays;

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        boolean isfirstrow=false, isfirstcolumn=false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i==0) isfirstrow=true;
                    if(j==0) isfirstcolumn=true;
                   matrix[0][j]=0;
                   matrix[i][0]=0;

                    }
                }
        }
        for(int i=1;i<matrix.length;i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(isfirstrow){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }
        if(isfirstcolumn){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
        for(int[] row:matrix){
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        SetMatrixZeroes set= new SetMatrixZeroes();
        int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        set.setZeroes(matrix);
    }
}
