import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;



class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        Map<String, Integer> indexMap = Map.of("code", 0, "date", 1, "maximum", 2, "remain", 3);
        
        // DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd");
        
        int[][] answer = Arrays.stream(data)
            .filter(arr-> arr[indexMap.get(ext)] < val_ext)
            .sorted(Comparator.comparing(arr-> arr[indexMap.get(sort_by)]))
            .collect(Collectors.toList()).toArray(new int[][]{{}});
        
            
        
        return answer;
    }
}