import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> pTRMap= new HashMap<>();
        Map<Integer, String> rTPMap = new HashMap<>();
        for(int i = 0; i<players.length; i++){
            pTRMap.put(players[i], i);
            rTPMap.put(i, players[i]);
        }
        for(String called : callings){
            int rank = pTRMap.get(called);
            String passed = rTPMap.get(rank-1);
            pTRMap.replace(passed, rank);
            pTRMap.replace(called, rank-1);
            rTPMap.replace(rank, passed);
            rTPMap.replace(rank-1, called);
            
        }
        String[] answer = new String[players.length];
        
        
        for(int i = 0; i<players.length; i++){
            answer[i] = rTPMap.get(i);
        }
            
        
        return answer;
    }
}