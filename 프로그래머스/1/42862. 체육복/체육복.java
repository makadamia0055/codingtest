import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        boolean[] got = new boolean[n];
        boolean[] lostBool = new boolean[n];
        boolean[] reserveBool = new boolean[n];
      
        for(int num : reserve){
            reserveBool[num-1] =true;
        }
        for(int num: lost){
            
            // 여분 가진 학생이 털렸을 때
            if(reserveBool[num-1]){
                reserveBool[num-1] = false;
            }else{
                lostBool[num-1] = true;
            }
            
        }
        
        
        
        
        // 양쪽 중 하나만 여분이 있는 학생일 때
        boolean[][] rst = borrow(lostBool, reserveBool);
        int answer = n;
        for(boolean b : rst[0]){
            if(b){
                answer--;
            }
        }
        
        
        
        return answer;
    }
    public boolean[][] borrow(boolean[] lostBool, boolean[] reserveBool){
        if(lostBool[0]&&reserveBool[1]){
            lostBool[0] = false;
            reserveBool[1] = false;
        }
        if(lostBool[lostBool.length-1]&&reserveBool[reserveBool.length-2]){
            lostBool[lostBool.length-1] = false;
            reserveBool[reserveBool.length-2] = false;
        }
        boolean[][] rst = recursive(lostBool, reserveBool);
        return rst;
    }
    public boolean[][] recursive(boolean[] lostBool, boolean[] reserveBool){
        int cnt = 0;
        for(int i = 1; i<lostBool.length-1; i++){
            if(!lostBool[i]){
                continue;
            }
            if((reserveBool[i-1]&&!reserveBool[i+1])||(!reserveBool[i-1]&&reserveBool[i+1])){
                cnt ++;
                int k = reserveBool[i-1]?i-1:i+1;
                lostBool[i] = false;
                reserveBool[k] = false;
            }
        }
        boolean[][] rst = new boolean[2][lostBool.length];
        if(cnt == 0){
            // 탈출 조건
            for(int i = 1; i<lostBool.length-1; i++){
                if(!lostBool[i]){
                    continue;
                }
                if(reserveBool[i-1]){
                    lostBool[i] = false;
                    reserveBool[i-1] = false;
                }
                
            }
            rst[0] = lostBool;
            rst[1] = reserveBool;
            return rst;
        }else{
           return recursive(lostBool, reserveBool);
        
        }
        
    }
}