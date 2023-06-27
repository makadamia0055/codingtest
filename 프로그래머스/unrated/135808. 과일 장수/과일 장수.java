import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int boxCnt = score.length/m;
        int discardApple = score.length - boxCnt*m;
        int point = 0;
        Arrays.sort(score);
        for(int i = discardApple; i<score.length; i+=m){
            point += score[i]*m;
        }
        
        
        int answer = point;
        return answer;
    }
}