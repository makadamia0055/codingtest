import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[][] wires) {
        Map<Integer, List<Integer>> edgeMap = new HashMap<>();
        for (int[] wire: wires){
            edgeMap.computeIfAbsent(wire[0], l-> new ArrayList<>())
                    .add(wire[1]);
            edgeMap.computeIfAbsent(wire[1], l-> new ArrayList<>())
                    .add(wire[0]);

        }
            int min = Integer.MAX_VALUE;
            for(int[] wire:wires){
                Set<Integer> set = new HashSet<>();
                set.add(wire[0]);
                int abs= Math.abs(2*(check(set, wire[1], edgeMap).size()-1) -n);
                min = min>abs?abs:min;
            }


            return min;
    }
    public Set<Integer> check(Set<Integer> buffer, int startPoint, Map<Integer, List<Integer>> map){
            // buffer = 밝혀낸 리스트 최초 라인의 반댓값으로 초기화, 이후 포함되는 값들을 넣음.
            if(buffer.contains(startPoint)){
                return buffer;
            }
            List<Integer> nextPointList = map.get(startPoint);
            buffer.add(startPoint);
            for(int nextPoint : nextPointList){
                if(buffer.contains(nextPoint)){
                    continue;
                }
                buffer.addAll(check(buffer, nextPoint, map));
            }
            return buffer;

    }
}