import java.util.stream.Stream;
import java.util.Arrays;
class Solution {
    public int solution(int[] num_list, int n) {
        int answer = Arrays.stream(num_list).filter(i-> i==n).findAny().isPresent()?1:0;
        return answer;
    }
}