import java.util.stream.*;
class Solution {
    public int solution(int[][] arr) {
        int arrLen = arr.length;
        boolean b = IntStream.range(0, arrLen).mapToObj(i-> i).allMatch(i -> IntStream.range(0, arrLen).allMatch(j -> arr[i][j] == arr[j][i]));
        return b?1:0;


    }
}