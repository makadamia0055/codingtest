import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];
        for(int i = 0; i<score.length; i++){
            list.add(score[i]);
            list = list.stream().sorted().collect(Collectors.toList());
            if(list.size()>k){
                list.remove(0);
            }
            answer[i] = list.get(0);
        }
        
        
        return answer;
    }
}