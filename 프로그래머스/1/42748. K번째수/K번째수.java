import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
         int[] answer = IntStream.range(0, commands.length).mapToObj(i->commands[i]).mapToInt(i-> IntStream.rangeClosed(i[0]-1, i[1]-1).map(j-> array[j]).sorted().skip(i[2]-1).findFirst().getAsInt()).toArray();
        
        
        
        return answer;
    }
}