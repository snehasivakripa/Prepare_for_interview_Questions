package Matrix;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        char[] strChar = word.toCharArray();
        boolean[][] visited=new boolean[board.length][board[0].length];
        int k = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == strChar[k]) {
                   if(checkneighbor(board, strChar, i, j, k ,visited)){
                       return true;
                   }
                }
            }
        }
        return false;
    }

    private boolean checkneighbor(char[][] board, char[] strChar, int i, int j, int k, boolean[][] visited) {
        if (k==strChar.length){
            return true;
        }
        if(i<0||j<0||i>=board.length||j>=board[0].length||visited[i][j]==true||board[i][j]!=strChar[k]){
            return false;
        }
        visited[i][j]=true;
        if(checkneighbor(board,strChar,i+1,j,k+1,visited)||
           checkneighbor(board,strChar,i-1,j,k+1,visited)||
           checkneighbor(board,strChar,i,j+1,k+1,visited)||
           checkneighbor(board,strChar,i,j-1,k+1,visited)
        ){
            return true;
        }
        visited[i][j]=false;
        return false;
    }

    public static void main(String[] args) {
        WordSearch wordSearch = new WordSearch();
        char[][] matrix = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String str = "ABCCED";
        System.out.println(wordSearch.exist(matrix, str));
    }
}
