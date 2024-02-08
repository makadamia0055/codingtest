import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
     
        Map<String, Long> map = Arrays.stream(participant).collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        for(String str : completion){
            if(map.get(str)>0L){
                map.replace(str, map.get(str)-1);
            }
        }
        return map.entrySet().stream().filter(entry-> entry.getValue()!=0).findAny().get().getKey();
    }
}