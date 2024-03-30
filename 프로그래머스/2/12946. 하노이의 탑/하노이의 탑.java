import java.util.*;
class Solution {
    public int[][] solution(int n) {
        
        List<int[]> list = new ArrayList<>();
        move(list, n, 1, 2, 3);
        int[][] answer = list.stream()
            .toArray(int[][]::new);
        
        return answer;
    }
    public List<int[]> move(List<int[]> list, int cnt, int start, int mid, int end){
        if (cnt == 0){
            return list;
        }
        move(list, cnt-1, start, end, mid);
        list.add(new int[]{start, end});
        move(list, cnt-1, mid, start, end);            
        return list;
    }
}