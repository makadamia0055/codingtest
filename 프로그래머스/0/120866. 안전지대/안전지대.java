import java.util.Arrays;
class Solution {
    public int solution(int[][] board) {
        boolean[][] isWarnning = new boolean[board.length][board[0].length];
        for(int y = 0; y<board.length; y++){
            
            for(int x = 0; x<board.length; x++){
                if(board[y][x]==1){
                    isWarnning[y][x] = true;
                    isWarnning = warnning(board, isWarnning, y, x);
                    
                }
            }
            
            
        }
       
        
        int answer = 0;
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(!isWarnning[i][j]){
                    answer++;
                }
            }
        }
        
        return answer;
    }
    public boolean[][] warnning(int[][] board, boolean[][] isWarnning, int indexY, int indexX){
        for(int y = -1; y<2; y++){
            for(int x = -1; x<2; x++){
                try{
                    if(board[indexY][indexX]==1){
                        isWarnning[indexY+y][indexX+x] = true;    
                    }
                    
                }catch(Exception e){
                    
                }
            }
        }
        return isWarnning;
    }
    
}