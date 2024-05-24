import java.util.*;

class Solution {
    private boolean[][] checkMap;
    private int[][] parseMap;

    public int[] solution(String[] maps) {
        List<Integer> list = new ArrayList<>();
        checkMap = new boolean[maps.length][maps[0].length()];
        parseMap = new int[maps.length][maps[0].length()];
        
        for(int i = 0; i<maps.length; i++){
            String str = maps[i];
            for(int j = 0; j<maps[i].length(); j++){
                if(str.charAt(j)=='X'){
                    checkMap[i][j] = true;
                    continue;
                }
                parseMap[i][j] = Integer.parseInt("" + str.charAt(j));
                
            }
        }
        
        
        for(int i = 0; i<parseMap.length; i++){
            for(int j = 0; j<parseMap[0].length; j++){
                if(checkMap[i][j]){
                    continue;
                }
                int cnt = recursive(new int[]{i, j});
                list.add(cnt);
                
                
            }
        }
        list.sort(Comparator.comparing(i->i));
        
        int[] rst = list.stream().mapToInt(i->i).toArray();
        return rst.length==0?new int[]{-1}:rst;
        
        
        
        
        
    }
    
    public int recursive(int[] arr){
        int cnt = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(arr);
        cnt += parseMap[arr[0]][arr[1]];
        checkMap[arr[0]][arr[1]] = true;
        
        int[] dxArr = {-1, 0, 1, 0};
        int[] dyArr = {0, -1, 0, 1};
        
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            
            for(int i = 0; i<4; i++){
                int dx = current[0] + dxArr[i];
                int dy = current[1] + dyArr[i];
                
                if(dx<0||dx>parseMap.length-1||dy<0||dy>parseMap[0].length-1){
                    continue;
                }
                if(checkMap[dx][dy]){
                    continue;
                }
                queue.add(new int[]{dx, dy});
                cnt += parseMap[dx][dy];
                checkMap[dx][dy] = true;
                
            }
        }
        return cnt;
        

    }
}