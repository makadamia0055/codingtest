class Solution {
    public int solution(int[][] board, int k) {
        int sum = 0;
        int innerLen = board[0].length;
        for(int i= 0; i<board.length; i++){
            for(int j= 0; j<innerLen&&j<=k-i; j++){
                sum+=board[i][j];
            }
        }
        return sum;
    }
}