import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
class Solution {
    public int solution(int k, int[] tangerine) {
        List<Integer> tanCntSortedList = Arrays.stream(tangerine)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .values()
            .stream()
            .map(Long::intValue)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());
        int cnt = 0;
        for(int i = 0; i<tanCntSortedList.size()&&k>0; i++){
            k -= tanCntSortedList.get(i);
            cnt = i;
        }
            
        return cnt+1;
    }
}