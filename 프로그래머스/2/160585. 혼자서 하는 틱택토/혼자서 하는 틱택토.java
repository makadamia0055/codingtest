import java.util.Arrays;

class Solution {
    public int solution(String[] board) {
        // 개수 체크
        int oCnt = 0;
        int xCnt = 0;
        for(String str : board){
            for(char c : str.toCharArray()){
                if(c == 'O') oCnt++;
                if(c == 'X') xCnt++;    
            }
        }
        if(!(oCnt>=xCnt&&oCnt-xCnt<=1)){
            return 0;
        }
        int oCrossed = 0;
        int xCrossed = 0;
        
        char center = board[1].charAt(1);
        if(center==board[0].charAt(0)&&center==board[2].charAt(2)){
            if(center=='O'){
                oCrossed++;
            }else if(center=='X'){
                xCrossed++;
            }    
        }
        if(center==board[0].charAt(2)&&center==board[2].charAt(0)){
            if(center=='O'){
                oCrossed++;
            }else if(center=='X'){
                xCrossed++;
            }  
        }
        
        
        for(int i= 0; i<3; i++){
            // 가로 체크
            if(board[i].equals("OOO")){
                oCrossed++;
            }else if(board[i].equals("XXX")){
                xCrossed++;
            }
            // 세로 체크
            if(board[0].charAt(i)=='O'&&board[1].charAt(i)=='O'&&board[2].charAt(i)=='O'){
                oCrossed++;
            }else if(board[0].charAt(i)=='X'&&board[1].charAt(i)=='X'&&board[2].charAt(i)=='X'){
                xCrossed++;
            }
            
        }
        // 검증
        if(oCrossed+xCrossed<=1){
            if(oCrossed==1&&oCnt==xCnt){
                return 0;
            }else if(xCrossed==1&&oCnt>xCnt){
                return 0;
            }else{
                return 1;
            }
        }else if(oCrossed>0&&xCrossed>0){
            return 0;
        }else{
            if(oCrossed==2&&xCrossed==0){
                return oCnt==5&&xCnt==4?1:0;
            }else{
                return 0;
            }
        }
            
    }
}