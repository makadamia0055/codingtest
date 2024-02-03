import java.util.stream.*;

class Solution {
    public int[][] solution(int n) {
        return Stream.iterate(0, i-> i+1).map(i-> {
            int[] arr = new int[n];
            arr[i] = 1;
            return arr;
        }).limit(n).collect(Collectors.toList()).toArray(new int[n][n]);
    }
}