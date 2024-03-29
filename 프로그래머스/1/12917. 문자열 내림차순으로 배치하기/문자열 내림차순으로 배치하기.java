import java.util.Arrays;
import java.util.stream.*;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        char[] cArr = s.toCharArray();
        return IntStream.range(0, s.length())
            .mapToObj(i-> String.valueOf(cArr[i]))
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining());
        
        
    }
}