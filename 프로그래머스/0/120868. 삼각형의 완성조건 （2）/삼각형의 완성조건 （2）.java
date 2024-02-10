class Solution {
    public int solution(int[] sides) {
        int highSide = sides[0]>sides[1]?sides[0]:sides[1];
        int lowSide = sides[0]<sides[1]?sides[0]:sides[1];
        int cnt = 0;
        for(int i = highSide; i<highSide + lowSide; i++){
            cnt += 1;
        }
       
        for(int i = 1; i<highSide; i++){
            if(highSide-lowSide<i){
                cnt++;
            }
            
        }
        return cnt;
    
    }
}